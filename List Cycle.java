import java.util.*;

public class Solution {
   public ListNode detectCycle(ListNode A) {
        ListNode a = A;
        ListNode slow = A;
        ListNode fast = A;
        while(fast!=null && fast.next!=null)
        {
            // System.out.println(slow.val+" "+fast.val);
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            break;
        }
        if(slow!=fast)
        return null;
        while(a!=slow)
        {
            // System.out.println(a.val+" "+slow.val);
            a = a.next;
            slow = slow.next;
        }
        return a;
    }
}
