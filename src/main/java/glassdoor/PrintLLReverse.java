package main.java.glassdoor;

import main.java.utility.ListNode;

/**
 * Created by arorai on 3/25/17.
 * List is 5->4->3->2->1
 * Print reverse using recursion
 */
public class PrintLLReverse {
    private static ListNode head;

    public static void main(String args[]) {
        head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        printReverse(head);
    }

    private static void printReverse(ListNode head) {
        if(head == null) return;
        printReverse(head.next);
        System.out.print(head.data + "->");
    }
}
