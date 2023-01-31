package net.htwater.algorithmmuke.list.linkedlistsolution;

class Solution {
    public ListNode removeElements(ListNode head, int val) {

//        while (head != null && head.val == val) {
//            head = head.next;
//        }
//
//        if (head == null) {
//            return null;
//        }
//
//        ListNode preNode = head;
//
//        while (preNode.next != null) {
//            if (preNode.next.val == val) {
//                preNode.next = preNode.next.next;
//            } else {
//                preNode = preNode.next;
//            }
//        }
//
//        return head;


        if (head == null) {
            return null;
        }

        head.next = removeElements(head.next, val);

        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }
    }
}
