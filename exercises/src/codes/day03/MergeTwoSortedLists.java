package codes.day03;

/**
 * @author Abner.S
 * @date 2020/1/5 23:23
 * @description
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);

        ListNode pre = prehead;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                pre.next = l1;
                l1 = l1.next;
            }else {
                pre.next = l2;
                l2 = l2.next;
            }

            pre = pre.next;
        }

        // 跳出循环，则证明 l1或l2有一个为空，无后续节点，直接将另一链表中可能未比较完的元素
        //直接追加到新链表后面
        pre.next = l1 == null ? l2 : l1;

        return prehead.next;
    }

}
