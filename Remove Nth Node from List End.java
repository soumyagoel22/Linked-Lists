import java.util.*;

public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        if(A==null)
        return null;
        int i,len=0,a;
        ListNode x = A;
        while(x!=null)
        {
            len++;
            x=x.next;
        }
        if(B>=len)
        {
            A = A.next;
        }
        else
        {
            ListNode y = A;
            a = len-B;
            for(i=0;i<a-1;i++)
            {
                y=y.next;
            }
            y.next=y.next.next;
        }
        return A;
    }
}
