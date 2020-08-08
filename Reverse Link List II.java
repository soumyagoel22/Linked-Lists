import java.util.*;

public class Solution {
    
    ListNode reverse(ListNode A,int b)
    {
        ListNode prev = null;
        ListNode next;
        ListNode a = A;
        int n = 1;
        while(n<=b && a!=null)
        {
            next = a.next;
            a.next = prev;
            prev = a;
            a = next;
            n++;
        }
        A.next = a;
        return prev;
    }
    
    public ListNode reverseBetween(ListNode A, int m, int n) {
        if(A==null || A.next==null || m==n)
        return A;
        ListNode a = A;
        ListNode temp = null;
        int b=1;
        while(b<m)
        {
            temp = A;
            A = A.next;
            b++;
        }
        ListNode prev = reverse(A,n-m+1);
        if(temp==null)
        return prev;
        temp.next = prev;
        return a;
    }
}
