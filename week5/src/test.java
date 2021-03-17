public class test {
    /*
        面试现场做的一道小题目，实现单链表功能。
        虽然写出来了，但是还是反应出基础不够熟练
     */
    public static void main(String[] args) {
        link link = new link();
        for (int i = 1; i <= 10; i++) {
            link.addNode(i);
        }
        link.destroyIndexNode(10);
        link.print();

    }
}
class node{
    public int a;
    public node next;
}

class link{
    node head = new node();
    node tail = head;
    void addNode(int x) {
        node temp = new node();
        temp.a = x;
        tail.next = temp;
        tail = temp;
    }

    void destroyIndexNode(int x) {
        node temp = head;
        for (int i = 0; i < x-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    void print() {
        node n = head.next;
        //System.out.println(n.a);
        while (n != null) {
            System.out.println(n.a);
            n = n.next;
        }
    }
}
