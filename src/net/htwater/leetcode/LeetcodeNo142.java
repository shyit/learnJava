package net.htwater.leetcode;

/**
 * 类  名: LeetcodeNo142
 * 描  述: LeetcodeNo142. 环形链表 II 中等
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-03-30 23:10
 */
public class LeetcodeNo142 {
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

        ListNode listNode = detectCycle(listNode11);

        // 2
        System.out.println(listNode.val);
    }

    public static ListNode detectCycle(ListNode head) {
        // 快指针 一次走两步
        ListNode listNodeFast = head;
        // 慢指针 一次走一步
        ListNode listNodeSlow = head;

        while (true) {
            // 如果快指针下一个 或者 下下一个为空 说明没有环 返回null
            if (listNodeFast == null || listNodeFast.next == null) {
                return null;
            }

            // 慢指针走一步
            listNodeSlow = listNodeSlow.next;
            // 快指针走两步
            listNodeFast = listNodeFast.next.next;

            // 如果快指针==慢指针 那么就有环
            if (listNodeSlow == listNodeFast) {
                break;
            }
        }

        // 如果有环 那快指针 改为一次一步 继续前进 同时第三个指针从 head出发。
        // 快指针和第三个指针 相遇的 地方 就是入环点
        ListNode listNodeThird = head;
        while (listNodeFast != listNodeThird) {
            // 慢指针走一步
            listNodeFast = listNodeFast.next;
            // 第三指针走一步
            listNodeThird = listNodeThird.next;
        }
        return listNodeThird;
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
