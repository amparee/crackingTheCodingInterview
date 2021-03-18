package app.linkedList;

public class LinkedListNode {

    LinkedListNode next = null;
    int data;

    public LinkedListNode(int d) {
        data = d;
    }

    static LinkedListNode of(int... list) {
        LinkedListNode pre = null;
        LinkedListNode head = null;
        for (int val : list) {
            if (pre == null) {
                head = new LinkedListNode(val);
                pre = head;
            } else {
                pre.next = new LinkedListNode(val);
                pre = pre.next;
            }
        }
        return head;
    }

    void appendToTail(int d) {
        LinkedListNode end = new LinkedListNode(d);
        LinkedListNode n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    LinkedListNode deleteNode(LinkedListNode head, int d){
        LinkedListNode n = head;

        if(n.data == d){
            return head.next;
        }

        while(n.next != null){
            if(n.next.data == d){
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
}
