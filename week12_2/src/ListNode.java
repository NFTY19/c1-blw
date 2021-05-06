public class ListNode {
    int value;
    ListNode next = null;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }

    public ListNode() {
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}
