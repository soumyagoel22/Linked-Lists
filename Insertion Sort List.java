import java.util.*;

public class Solution {
    public ListNode insertionSortList(ListNode A) {
        ListNode head = new ListNode(0);
        ListNode it = A;
        while (it != null) {
            ListNode next = it.next;
            ListNode in = head;
            while (in.next != null && in.next.val < it.val) {
                in = in.next;
            }
            it.next = in.next;
            in.next = it;
            it = next;
        }
        return head.next;
    }
}
