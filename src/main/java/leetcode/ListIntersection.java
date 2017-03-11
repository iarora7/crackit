package main.java.leetcode;

/**
 * Created by arorai on 1/23/17.
 */
public class ListIntersection {

//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        int lenA=0, lenB=0;
//        ListNode hA = headA, hB = headB;
//        while(headA != null) {
//            lenA++;
//            headA = headA.next;
//        }
//        while(headB != null) {
//            lenB++;
//            headB = headB.next;
//        }
//        int diff = lenA - lenB;
//        if(diff > 0) {
//            while(diff > 0){
//                hA = hA.next;
//                diff--;
//            }
//        } else {
//            diff = Math.abs(diff);
//            while(diff > 0){
//                hB = hB.next;
//                diff--;
//            }
//        }
//
//        while(hA != null || hB != null) {
//            if(hA == hB) return hA;
//            else {
//                hA = hA.next;
//                hB = hB.next;
//            }
//        }
//
//        return null;
//    }
}
