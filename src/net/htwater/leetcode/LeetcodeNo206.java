package net.htwater.leetcode;

/**
 * 类  名: LeetcodeNo206
 * 描  述: LeetcodeNo206. 反转链表 简单
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-04-01 14:14
 */
public class LeetcodeNo206 {

    // 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
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

        ListNode listNodeResult = reverseList2(listNode1);

        // 5 4 3 2 1
        ListNode listNodeNow = listNodeResult;
        while (listNodeNow != null) {
            System.out.println(listNodeNow.val);
            listNodeNow = listNodeNow.next;
        }
    }


    // 迭代法
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // 当前节点
        ListNode listNodeNow = head;
        // 下一个节点
        ListNode listNodeNext = listNodeNow.next;
        // 设置头节点的下一个节点为null
        head.next = null;

        // 遍历链表 翻转链表指向
        while (listNodeNext != null) {
            // 临时节点
            ListNode listNodeTemp = listNodeNext.next;
            listNodeNext.next = listNodeNow;
            listNodeNow = listNodeNext;
            listNodeNext = listNodeTemp;
        }

        return listNodeNow;
    }

    // 递归法
    public static ListNode reverseList2(ListNode head) {
        // 递归结束条件
        if (head == null || head.next == null) {
            return head;
        }

        // 上一个递归返回的链表
        ListNode headNew = reverseList2(head.next);

        // 上一个递归返回的链表 最后的节点是 head.next 。翻转链表，让他指向当前一个节点
        head.next.next = head;

        // 当前节点指向 改为 null
        head.next = null;

        return headNew;
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
