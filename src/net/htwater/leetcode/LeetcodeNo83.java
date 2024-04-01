package net.htwater.leetcode;

/**
 * 类  名: LeetcodeNo83
 * 描  述: LeetcodeNo83. 删除排序链表中的重复元素 简单
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-03-29 16:02
 */
public class LeetcodeNo83 {

    // 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
    public static void main(String[] args) {
        ListNode listNode11 = new ListNode(1);
        ListNode listNode12 = new ListNode(1);
        ListNode listNode13 = new ListNode(2);
        ListNode listNode14 = new ListNode(3);
        ListNode listNode15 = new ListNode(3);
        listNode11.next = listNode12;
        listNode12.next = listNode13;
        listNode13.next = listNode14;
        listNode14.next = listNode15;

        ListNode listNodeResult = deleteDuplicates(listNode11);

        // 1 2 3
        ListNode listNodeNow = listNodeResult;
        while (listNodeNow != null) {
            System.out.println(listNodeNow.val);
            listNodeNow = listNodeNow.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode listNodePre = head;
        while (listNodePre != null && listNodePre.next != null) {
            if (listNodePre.val == listNodePre.next.val) {
                listNodePre.next = listNodePre.next.next;
            } else {
                listNodePre = listNodePre.next;
            }
        }

        return head;
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
