class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while (curr != null) {
            next = curr.next;   // store next node
            curr.next = prev;   // reverse link
            prev = curr;        // move prev forward
            curr = next;        // move curr forward
        }

        return prev;  // new head of reversed list
    }
}
