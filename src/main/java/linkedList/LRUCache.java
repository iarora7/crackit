package main.java.linkedList;

import java.util.HashMap;
import java.util.Map;

import main.java.utility.DoublyLLNode;

public class LRUCache {
	DoublyLinkedList pageList;
	Map<Integer, DoublyLLNode> map;
	int size;

	public LRUCache(int n) {
		this.size = n;
		pageList = new DoublyLinkedList(size);
		map = new HashMap<>();
	}

	public static void main(String args[]) {
		LRUCache cache = new LRUCache(4);
		cache.accesspage(3);
		cache.printCacheState();
		cache.accesspage(2);
		cache.accesspage(1);
		cache.accesspage(4);
		cache.accesspage(2);
		cache.accesspage(5);
		cache.accesspage(7);
		cache.printCacheState();
		
	}

	private void accesspage(int i) {
		DoublyLLNode pageNode;
		if (map.containsKey(i)) {
			pageNode = map.get(i);
			pageList.movePageToHead(pageNode);
		} else {
			pageNode = new DoublyLLNode(i);
			if(pageList.currSize == pageList.size) {
				map.remove(pageList.tail.data);
			}
			
			map.put(i, pageNode);
			pageList.addPage(pageNode);
		}
	}

	private void printCacheState() {
		pageList.printList();
		System.out.println();
	}

}

class DoublyLinkedList {

	public int size;
	public int currSize;
	public DoublyLLNode head;
	public DoublyLLNode tail;

	public DoublyLinkedList(int size) {
		this.size = size;
		head = tail = null;
	}

	public void addPage(DoublyLLNode pageNode) {
		if(head==null) {
			head = tail = pageNode;
			currSize = 1;
			return;
		}
		if(currSize<size) {
			currSize++;
		} else {
			tail = tail.prev;
			tail.next = null;
		}
		pageNode.next = head;
		pageNode.prev = null;
		head.prev = pageNode;
		head = pageNode;
		
	}

	public void printList() {
		if(head == null){
			return;
		}
		DoublyLLNode tmp = head;
		while(tmp!=null){
			System.out.print(tmp.data + "->");
			tmp = tmp.next;
		}
	}

	public void movePageToHead(DoublyLLNode pageNode) {

		if (pageNode == null || head == pageNode) {
			return;
		}

		if (tail == pageNode) {
			tail = tail.prev;
			tail.next = null;
		}

		pageNode.prev.next = pageNode.next;
		if (pageNode.next != null) {
			pageNode.next.prev = pageNode.prev;
		}

		pageNode.next = head;
		pageNode.next.prev = pageNode;
		pageNode.prev = null;
		head = pageNode;
	}

}
