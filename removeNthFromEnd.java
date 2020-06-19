class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || (head.next == null && n ==1)) {
            return null;
        }
        int l = 0;
        ListNode temp = head;
        while (temp!=null) {
            l++;
            temp = temp.next;
        }
        if (l == n) {
            return head.next;
        }
        
        temp = head;
        for (int i = 1; i < l-n; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        
        return head;
    }
}