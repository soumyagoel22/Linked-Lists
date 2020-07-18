public class Solution {
    public ListNode rotateRight(ListNode a, int b) {
       ListNode a1 = a;
       ListNode ab = new ListNode(0);
       ListNode ab1 = ab;
       ListNode b1 = new ListNode(0);
       ListNode b2 = b1;
       int i,len=0;
       while(a1!=null)
       {
           len++;
           a1 = a1.next;
       }
       b = b%len;
       a1=a;
       for(i=0;i<len-b;i++)
       {
           b2.next = a1;
           a1=a1.next;
           b2=b2.next;
       }
       b2.next = null;
       while(a1!=null)
       {
           ab1.next = a1;
           ab1 = ab1.next;
           a1 = a1.next;
       }
       ab1.next = b1.next;
       return ab.next;
    }
}
