public class Link {
    ListNode head = new ListNode();
    ListNode tail = head;
    int size = 0;

    public void pushBack(int val) {
        ListNode lNode = new ListNode(val);
        tail.next = lNode;
        tail = lNode;
        size++;
    }

    public void print() {
        ListNode node = head.next;
        while (node != tail.next) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
}
