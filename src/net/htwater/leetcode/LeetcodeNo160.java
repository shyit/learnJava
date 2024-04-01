package net.htwater.leetcode;

/**
 * 类  名: LeetcodeNo160
 * 描  述: LeetcodeNo160. 相交链表 简单
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-03-31 21:56
 */
public class LeetcodeNo160 {

    // 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
    // 图示两个链表在节点 c1 开始相交：
    // 题目数据 保证 整个链式结构中不存在环。
    // 注意，函数返回结果后，链表必须 保持其原始结构 。
    public static void main(String[] args) {
        ListNode listNode11 = new ListNode(11);
        ListNode listNode12 = new ListNode(12);
        ListNode listNode21 = new ListNode(21);
        ListNode listNode22 = new ListNode(22);
        ListNode listNode23 = new ListNode(23);
        ListNode listNode31 = new ListNode(31);
        ListNode listNode32 = new ListNode(32);
        ListNode listNode33 = new ListNode(33);

        listNode11.next = listNode12;
        listNode12.next = listNode31;

        listNode31.next = listNode32;
        listNode32.next = listNode33;

        listNode21.next = listNode22;
        listNode22.next = listNode23;
        listNode23.next = listNode31;
        listNode31.next = listNode32;
        listNode32.next = listNode33;

        ListNode intersectionNode = getIntersectionNode2(listNode11, listNode21);

        // 31
        System.out.println(intersectionNode.val);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 如果 都是 null 返回null
        if (headA == null || headB == null) {
            return null;
        }

        // 链表A指针
        ListNode listNodeAaNow = headA;
        // 链表B指针
        ListNode listNodeBbNow = headB;


        while (listNodeAaNow != listNodeAaNow) {
            // 如果 链表A指针为null 切换到链表B
            // 如果不为null 取下一个值
            if (listNodeAaNow == null) {
                listNodeAaNow = headB;
            } else {
                listNodeAaNow = listNodeAaNow.next;
            }

            // 如果 链表B指针为null 切换到链表A
            // 如果不为null 取下一个值
            if (listNodeBbNow == null) {
                listNodeBbNow = headA;
            } else {
                listNodeBbNow = listNodeBbNow.next;
            }
        }

        return listNodeAaNow;
    }

    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        // 如果 有一个是 null 返回null
        if (headA == null || headB == null) {
            return null;
        }

        // 链表A指针
        ListNode listNodeAaNow = headA;
        // 链表B指针
        ListNode listNodeBbNow = headB;

        // 链表A长度
        int countAa = 0;
        // 链表B长度
        int countBb = 0;

        // 计算链表A长度
        while (listNodeAaNow != null) {
            listNodeAaNow = listNodeAaNow.next;
            countAa++;
        }

        // 计算链表B长度
        while (listNodeBbNow != null) {
            listNodeBbNow = listNodeBbNow.next;
            countBb++;
        }

        // 重置链表A指针
        listNodeAaNow = headA;
        // 重置链表B指针
        listNodeBbNow = headB;

        // 比较长的链表 先走长度差距的长度
        if (countAa >= countBb) {
            for (int i = 0; i < countAa - countBb; i++) {
                listNodeAaNow = listNodeAaNow.next;
            }
        } else {
            for (int i = 0; i < countBb - countAa; i++) {
                listNodeBbNow = listNodeBbNow.next;
            }
        }

        while (listNodeAaNow != listNodeBbNow) {
            listNodeAaNow = listNodeAaNow.next;
            listNodeBbNow = listNodeBbNow.next;
        }

        return listNodeAaNow;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
