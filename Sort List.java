import java.util.*;

public class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        return mergeSort(head);
    }
    
    private ListNode mergeSort(ListNode node) {
        if(node.next == null)
            return node;
        ListNode slow = node;
        ListNode fast = node.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode right = mergeSort(slow.next);
        slow.next = null;
        ListNode left = mergeSort(node);
        return merge(left, right);
    }
    
    private ListNode merge(ListNode left, ListNode right) {
        ListNode head = null;
        if(left.val < right.val) {
            head = left;
            left = left.next;
        } else {
            head = right;
            right = right.next;
        }
        ListNode tail = head;
        while(left != null && right != null) {
            if(left.val < right.val) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }
        if(left != null) 
            tail.next = left;
        else if(right != null)
            tail.next = right ;
        return head;
    }
}
