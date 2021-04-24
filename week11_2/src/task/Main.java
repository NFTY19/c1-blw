package task;

import org.junit.Test;


public class Main {
    @Test
    public void Test1() {
        Link link = new Link();
        link.pushBack(1);
        link.pushBack(2);
        link.pushBack(6);
        link.pushBack(4);
        link.pushBack(10);
        link.pushBack(12);
        //link.print();
        Link reverseLink = reverse(link);
        reverseLink.pushBack(10);
        reverseLink.pushBack(20);
        //System.out.println(reverseLink.tail.value);
        reverseLink.print();
    }


    public static Link reverse(Link list) {
        Link rLink = new Link();
        ListNode node = list.head.next;//指向list头结点
        rLink.tail = new ListNode(node.value);//把list的第一个元素 设为 翻转rlist的tail
        rLink.head.next = rLink.tail;
        while (node != list.tail) {
            node = node.next;//不断推移
            ListNode temp = new ListNode(node.value);//创建一个新结点
            temp.next = rLink.head.next;//更新新结点的next
            rLink.head.next = temp;//头插法
        }
        return rLink;
    }

    @Test
    public void test2() {
        Link link1 = new Link();
        link1.pushBack(1);
        link1.pushBack(2);
        link1.pushBack(3);
        link1.pushBack(4);
        link1.pushBack(10);
        link1.pushBack(12);

        Link link2 = new Link();
        link2.pushBack(0);
        link2.pushBack(2);
        link2.pushBack(5);
        link2.pushBack(8);
        link2.pushBack(10);
        link2.pushBack(12);

        Link link = mergeList(link1, link2);
        link.print();
    }


    public static Link mergeList(Link l1, Link l2) {
        Link list = new Link();
        ListNode n1 = l1.head.next;
        ListNode n2 = l2.head.next;
        while (n1 != l1.tail.next && n2 != l2.tail.next) {
            if (n1.value > n2.value) {
                list.pushBack(n2.value);
                n2 = n2.next;
            }
            else {
                list.pushBack(n1.value);
                n1 = n1.next;
            }
        }
        while (n1 != l1.tail.next) {
            list.pushBack(n1.value);
            n1 = n1.next;
        }
        while (n2 != l2.tail.next) {
            list.pushBack(n2.value);
            n2 = n2.next;
        }
        return list;
    }

    @Test
    public void test3() {
        Link link1 = new Link();
        link1.pushBack(1);
        link1.pushBack(2);
        link1.pushBack(3);
        link1.pushBack(3);
        link1.pushBack(2);
        link1.pushBack(1);
        System.out.println(isPalindrome(link1));
    }

    public static boolean isPalindrome(Link l) {
        Link rL = reverse(l);
        ListNode node1 = l.head.next;
        ListNode node2 = rL.head.next;
        while (node1 != l.tail.next && node2 != rL.tail.next) {
            if(node1.value != node2.value)  return false;
            node1 = node1.next;
            node2 = node2.next;
        }
        return true;
    }
}
