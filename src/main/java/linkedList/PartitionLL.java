package main.java.linkedList;

import main.java.utility.ListNode;


public class PartitionLL {

	public static void main(String args[]) {
//		ListNode head = new ListNode(11);
//	     head.next = new ListNode(13);
//	     head.next.next = new ListNode(5);
//	     head.next.next.next = new ListNode(32);
//	     head.next.next.next.next = new ListNode(7);
	     
	     ListNode head = new ListNode(3);
	     head.next = new ListNode(5);
	     head.next.next = new ListNode(8);
	     head.next.next.next = new ListNode(5);
	     head.next.next.next.next = new ListNode(10);
	     head.next.next.next.next.next = new ListNode(2);
	     head.next.next.next.next.next.next = new ListNode(1);
		
	    
	    
	     head = partitionList(head, 5);
	     while(head!=null) {
	    	 System.out.print(head.data + "->");
	    	 head = head.next;
	     }
	}

	private static ListNode partitionList(ListNode node, int i) {
		ListNode beforeList=null, afterList = null;
		if(node==null) {
			return null;
		}
		
		while(node!=null) {
			ListNode next = node.next;
			if(node.data < i) {
				node.next = beforeList;
				beforeList = node;
			} else if(node.data >= i) {
				node.next = afterList;
				afterList = node;
			}
			node = next;
		}
		
		//Merge before and after
		if(beforeList == null) {
			return afterList;
		}
		ListNode head = beforeList;
		while(beforeList.next!=null) {
			beforeList = beforeList.next;
		}
		beforeList.next = afterList;
		return head;
	}
}
