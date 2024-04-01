package net.htwater.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 类  名: LeetcodeNo141
 * 描  述: LeetcodeNo141. 环形链表 简单
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-03-30 20:06
 */
public class LeetcodeNo141 {

    // 给你一个链表的头节点 head ，判断链表中是否有环。
    // 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。
    // 如果链表中存在环 ，则返回 true 。 否则，返回 false 。
    public static void main(String[] args) {
        ListNode listNode11 = new ListNode(3);
        ListNode listNode12 = new ListNode(2);
        ListNode listNode13 = new ListNode(0);
        ListNode listNode14 = new ListNode(4);
        listNode11.next = listNode12;
        listNode12.next = listNode13;
        listNode13.next = listNode14;
        listNode14.next = listNode12;

        boolean hasCycleBoolean = hasCycle2(listNode11);

        // true
        System.out.println(hasCycleBoolean);
    }

    public static boolean hasCycle(ListNode head) {
        // 遍历head 放入HashSet中 判断是否重复
        Set<ListNode> listNodeSet = new HashSet<>();
        while (head != null) {
            if (listNodeSet.contains(head)) {
                return true;
            } else {
                listNodeSet.add(head);
                head = head.next;
            }
        }

        return false;
    }

    public static boolean hasCycle2(ListNode head) {
        // 快指针 一次走两步
        ListNode listNodeFast = head;
        // 慢指针 一次走一步
        ListNode listNodeSlow = head;

        while (true) {
            // 如果快指针下一个 或者 下下一个为空 说明没有环 返回false
            if (listNodeFast == null || listNodeFast.next == null) {
                return false;
            }

            // 慢指针走一步
            listNodeSlow = listNodeSlow.next;
            // 快指针走两步
            listNodeFast = listNodeFast.next.next;

            // 如果快指针==慢指针 那么就有环
            if (listNodeSlow == listNodeFast) {
                return true;
            }
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
