import java.util.HashSet;

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while(head != null) {
            if(set.contains(head)) {
                return true;
            }else {
                set.add(head);
                head = head.next;
            }
        }
        return false;
    }
}
