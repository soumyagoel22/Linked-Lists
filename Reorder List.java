import java.util.*;

public class Solution {
    
    public static ListNode findMid(ListNode A)
    {
        ListNode a = A;
        ListNode slow = A;
        ListNode fast = A;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public static ListNode reverse(ListNode A){
        ListNode a = A;
        ListNode prev = null;
        while(a!=null)
        {
            ListNode temp = a.next;
            a.next = prev;
            prev = a;
            a = temp;
        }
        return prev;
    }
    
    public ListNode reorderList(ListNode A) {
         ListNode a = A;
         ListNode mid = findMid(A);
         ListNode rev = reverse(mid);
         ListNode ab = new ListNode(0);
         ListNode ab1 = ab;
         while(a!=null && rev!=null)
         {
             if(a==rev)
             {
                 ab1.next = new ListNode(a.val);
             }
             else
             {
                  ab1.next = new ListNode(a.val);
                  ab1 = ab1.next;
                  ab1.next = new ListNode(rev.val);
             }
             ab1 = ab1.next;
             a = a.next;
             rev = rev.next;
         }
         return ab.next;
    }
}
