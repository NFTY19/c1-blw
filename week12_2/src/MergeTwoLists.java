public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode ans = head;

        while(l1 != null && l2 != null) {
            if(l1.value > l2.value) {
                head.next = l2;
                l2 = l2.next;
            }else {
                head.next = l1;
                l1 = l1.next;
            }
            head = head.next;
        }

        while(l1 != null) {
            head.next = l1;
            l1 = l1.next;
            head = head.next;
        }

        while(l2 != null) {
            head.next = l2;
            l2 = l2.next;
            head = head.next;
        }
        return ans.next;
    }
}
