public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)    return null;
        ListNode ans = head;
        while(head.next != null) {
            if(head.value == head.next.value) {
                head.next = head.next.next;
            }else   head = head.next;
        }
        return ans;
    }
}
