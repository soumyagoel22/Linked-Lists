public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
       if(B==null)
       return A;
       if(A==null)
       return B;
       ListNode a = A;
       ListNode b = B;
       ListNode ab = new ListNode(0);
       ListNode ab1 = ab;
       while(a!=null && b!=null)
       {
           if(a.val<=b.val)
           {
               ab1.next = a;
               a=a.next;
           }
           else
           {
                ab1.next = b;
                b=b.next;
           }
           ab1 = ab1.next;
       }
       if(a!=null)
       {
           ab1.next = a;
       }
       if(b!=null)
       {
           ab1.next = b;
       }
       return ab.next;
    }
}
