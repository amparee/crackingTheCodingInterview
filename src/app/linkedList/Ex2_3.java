package app.linkedList;

import java.util.LinkedList;

public class Ex2_3 {

    public boolean deleteMiddleNode(LinkedListNode node){
        if (node == null || node.next == null) return false;
        LinkedListNode next = node.next;
        node.data = next.data;
        node.next = next.next;
        return true;
    }

}
