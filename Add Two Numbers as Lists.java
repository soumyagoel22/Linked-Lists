import java.util.*;

public class Solution {
    
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
       int carry=0;
       ListNode a = A;
       ListNode b = B;
       ListNode ab = new ListNode(0);
       ListNode ab1 = ab;
       while(a!=null || b!=null)
       {
           if(a!=null)
           {
               carry+=a.val;
               a = a.next;
           }
           if(b!=null)
           {
               carry+=b.val;
               b = b.next;
           }
           ab1.next = new ListNode(carry%10);
           ab1 = ab1.next;
           carry/=10;
       }
       if(carry==1)
       {
           ab1.next = new ListNode(1);
       }
       return ab.next;
    }
}
