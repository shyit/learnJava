package net.htwater.leetcode;

/**
 * 类  名: LeetcodeNo876
 * 描  述: LeetcodeNo876. 链表的中间结点
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-04-02 12:44
 */
public class LeetcodeNo876 {
    // 给你单链表的头结点 head ，请你找出并返回链表的中间结点。
    // 如果有两个中间结点，则返回第二个中间结点。
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode listNodeMiddle = middleNode(listNode1);

        // true
        System.out.println(listNodeMiddle.val);
    }

    public static ListNode middleNode(ListNode head) {
        // 如果链表为null 或者只有一个节点
        if (head == null || head.next == null) {
            return head;
        }

        // 慢指针
        ListNode listNodeSlow = head;

        // 快指针
        ListNode listNodeFast = head;

        // 遍历链表 快指针走完 慢指针正好走一半
        while (listNodeFast != null && listNodeFast.next != null) {
            listNodeSlow = listNodeSlow.next;
            listNodeFast = listNodeFast.next.next;
        }

        return listNodeSlow;
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
