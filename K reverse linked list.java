import java.util.*;

public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        ListNode a = A;
        ListNode b = A;
        ListNode prev = null;
        ListNode temp = null;
        int count = 0;
        while(count<B && a!=null)
        {
            temp = a.next;
            a.next = prev;
            prev = a;
            a = temp;
            count++;
        }
        if(temp!=null)
        {
            b.next = reverseList(temp,B);
        }
        return prev;
    }
}
