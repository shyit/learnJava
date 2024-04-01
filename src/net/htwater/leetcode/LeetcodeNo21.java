package net.htwater.leetcode;


/**
 * 类  名: LeetcodeNo21
 * 描  述: LeetcodeNo21. 合并两个有序链表
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-03-28 20:53
 */
public class LeetcodeNo21 {

    // 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
    public static void main(String[] args) {
        ListNode listNode11 = new ListNode(1);
        ListNode listNode12 = new ListNode(2);
        ListNode listNode13 = new ListNode(4);
        listNode11.next = listNode12;
        listNode12.next = listNode13;

        ListNode listNode21 = new ListNode(1);
        ListNode listNode22 = new ListNode(3);
        ListNode listNode23 = new ListNode(4);
        listNode21.next = listNode22;
        listNode22.next = listNode23;

        ListNode listNodeResult = mergeTwoLists(listNode11, listNode21);

        // 1 1 2 3 4 4
        ListNode listNodeNow = listNodeResult;
        while (listNodeNow != null) {
            System.out.println(listNodeNow.val);
            listNodeNow = listNodeNow.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listNodeOneNow = list1;
        ListNode listNodeTwoNow = list2;

        ListNode listNodeResultNow = new ListNode();
        ListNode listNodeResult = listNodeResultNow;

        while (listNodeOneNow != null || listNodeTwoNow != null) {
            if (listNodeOneNow == null) {
                listNodeResultNow.next = listNodeTwoNow;
                break;
            }
            if (listNodeTwoNow == null) {
                listNodeResultNow.next = listNodeOneNow;
                break;
            }

            if (listNodeOneNow.val <= listNodeTwoNow.val) {
                listNodeResultNow.next = listNodeOneNow;
                listNodeResultNow = listNodeResultNow.next;
                listNodeOneNow = listNodeOneNow.next;
            } else {
                listNodeResultNow.next = listNodeTwoNow;
                listNodeResultNow = listNodeResultNow.next;
                listNodeTwoNow = listNodeTwoNow.next;
            }

        }

        return listNodeResult.next;
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
