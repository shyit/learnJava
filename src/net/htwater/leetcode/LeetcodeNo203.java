package net.htwater.leetcode;


/**
 * 类  名: LeetcodeNo203
 * 描  述: LeetcodeNo203. 移除链表元素
 * 
 * 功  能: 
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-06-28 20:48
 */
public class LeetcodeNo203 {

    //    给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(6);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(5);
        ListNode listNode7 = new ListNode(6);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;

        int val = 6;

        ListNode listNodeNew = removeElements(listNode1, val);

        ListNode listNodeTemp = listNodeNew;
        while (listNodeTemp != null) {
            System.out.println(listNodeTemp.val);
            listNodeTemp = listNodeTemp.next;
        }

    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        ListNode listNodeHeadNew = new ListNode();
        listNodeHeadNew.next = head;

        ListNode listNodeTemp = listNodeHeadNew;

        while (listNodeTemp.next != null) {
            if (listNodeTemp.next.val != val) {
                listNodeTemp = listNodeTemp.next;
            } else if (listNodeTemp.next.next != null) {
                listNodeTemp.next = listNodeTemp.next.next;
            } else {
                listNodeTemp.next = null;
            }
        }
        
        return listNodeHeadNew.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
