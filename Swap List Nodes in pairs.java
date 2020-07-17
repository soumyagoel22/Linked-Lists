public class Solution {
    public ListNode swapPairs(ListNode A) {
      ListNode a = A;
      ListNode a1 = new ListNode(0);
      ListNode a2 = a1,next;
      while(a!=null && a.next!=null)
      {
          next = a.next.next;
          a2.next = a.next;
          a2 = a.next;
          a2.next = a;
          a2 = a;
          a = next;
      }
      a2.next = a;
      return a1.next;
    }
}
