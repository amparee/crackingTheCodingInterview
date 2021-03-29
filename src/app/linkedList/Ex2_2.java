package app.linkedList;

public class Ex2_2 {

    public Integer printKthToLast(LinkedListNode head, int k){
        int index = 0;
        LinkedListNode kth = head;

        while (head.next != null) {
            if (index == k) {
                kth = kth.next;
            } else {
                index++;
            }
            head = head.next;
        }

        return index == k ? kth.data : null;

    }

}
