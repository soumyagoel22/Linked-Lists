public class Solution {
    public ListNode deleteDuplicates(ListNode a) {
        ListNode current = a;
        System.out.println(a.val+" "+current.val+" ");
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
            System.out.print(current.val+" ");
        }
        return a;
    }
}
