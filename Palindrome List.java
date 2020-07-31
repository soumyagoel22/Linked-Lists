import java.util.*;

public class Solution {
    
    ListNode findMid(ListNode A)
    {
        ListNode slow = A;
        ListNode fast = A;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    ListNode reverse(ListNode A)
    {
        ListNode a = A;
        ListNode prev = null;
        while(a!=null)
        {
            ListNode temp = a.next;
            a.next = prev;
            prev = a;
            a=temp;
        }
        return prev;
    }
    
    public int lPalin(ListNode A) {
       ListNode a = A;
       ListNode mid = findMid(A);
       ListNode rev = reverse(mid);
       while(a!=null && rev!=null)
       {
        //   System.out.println(a.val+" "+rev.val);
           if(a.val!=rev.val)
           {
               return 0;
           }
           a = a.next;
           rev = rev.next;
       }
       return 1;
    }
}
