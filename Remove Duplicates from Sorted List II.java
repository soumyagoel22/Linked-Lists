import java.util.*;

public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode head = A;
        ListNode prev = null;
        ListNode curr = A;
        
        while(curr!=null)
        {
            ListNode next = curr.next;
            if(next!=null)
            {
                if(curr.val!=next.val)
                {
                  prev = curr;
                   
                }else
                {
                    while(next!=null && next.val==curr.val)
                    {
                        next = next.next;
                    }
                    if(prev==null)
                    {
                        //prev = next;
                        head = next;
                    }else{
                        prev.next = next;
                    }
                   
                }
                 curr = next;
                 }else
            {
                break;
            }
        }
        return head;
    }
}
