package net.htwater.algorithmmuke.list.linkedlistsolution;

public class ReverseLinkedListSolution {

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode listNode = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return listNode;


//        ListNode prevNode = null;
//        ListNode currentNode = head;
//
//        while (currentNode != null) {
//            ListNode nextNode = currentNode.next;
//
//            currentNode.next = prevNode;
//            prevNode = currentNode;
//            currentNode = nextNode;
//        }
//
//        return prevNode;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(5);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(2);
        ListNode listNode5 = new ListNode(1);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        System.out.println(listNode1.val);
        System.out.println(listNode1.next.val);
        System.out.println(listNode1.next.next.val);
        System.out.println(listNode1.next.next.next.val);
        System.out.println(listNode1.next.next.next.next.val);

        ListNode listNode = reverseList(listNode1);
        System.out.println(listNode.val);
        System.out.println(listNode.next.val);
        System.out.println(listNode.next.next.val);
        System.out.println(listNode.next.next.next.val);
        System.out.println(listNode.next.next.next.next.val);

    }
}
