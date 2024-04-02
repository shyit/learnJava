package net.htwater.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 类  名: LeetcodeNo234
 * 描  述: LeetcodeNo234. 回文链表
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-04-02 10:09
 */
public class LeetcodeNo234 {

    // 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。
    // 如果是，返回 true ；否则，返回 false 。
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(1);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        boolean palindromeBoolean = isPalindrome2(listNode1);

        // true
        System.out.println(palindromeBoolean);
    }

    // 保存到数组 来回对比
    public static boolean isPalindrome(ListNode head) {
        // 如果为null 返回false
        if (head == null) {
            return false;
        }

        // 遍历链表 存储到数组中
        List<ListNode> listNodeList = new ArrayList<>();
        while (head != null) {
            listNodeList.add(head);
            head = head.next;
        }

        // 从两端遍历数组 判断是否回文
        for (int i = 0; i < listNodeList.size() / 2; i++) {
            if (listNodeList.get(i).val != listNodeList.get(listNodeList.size() - 1 - i).val) {
                return false;
            }
        }

        return true;
    }


    // 翻转后半段链表
    public static boolean isPalindrome2(ListNode head) {
        // 如果为null 返回false
        if (head == null) {
            return false;
        }

        if (head.next == null) {
            return true;
        }

        ListNode listNodeSlow = head;
        ListNode listNodeFast = head;
        while (listNodeFast != null) {
            listNodeSlow = listNodeSlow.next;
            listNodeFast = listNodeFast.next;
            if (listNodeFast != null) {
                listNodeFast = listNodeFast.next;
            }
        }

        // 反转后的链表
        ListNode listNodeReverse = reverseNodeList(listNodeSlow);
        // 原始链表
        ListNode listNodeNew = head;

        // 遍历 判断是否回文
        while (listNodeReverse != null) {
            if (listNodeNew.val != listNodeReverse.val) {
                return false;
            }
            listNodeNew = listNodeNew.next;
            listNodeReverse = listNodeReverse.next;
        }

        return true;
    }

    // 反转链表
    private static ListNode reverseNodeList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // 当前节点
        ListNode listNodeNow = head;
        // 下一个节点
        ListNode listNodeNext = head.next;
        // 设置头节点的下一个节点为null
        listNodeNow.next = null;

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
