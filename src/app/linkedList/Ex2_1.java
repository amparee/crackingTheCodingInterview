package app.linkedList;

import java.util.HashSet;

public class Ex2_1 {

    public static void main(String[] args) {
        Ex2_1 ex2_1 = new Ex2_1();
        LinkedListNode n = LinkedListNode.of(1,2,2,3,4,4);
        ex2_1.deleteDups(n);
        System.out.println(n.toString());
    }

    void deleteDups(LinkedListNode n) {
        HashSet hs = new HashSet<Integer>();
        LinkedListNode previous = null;
        while(n != null){
            if(hs.contains(n.data)){
                previous.next = n.next;
            } else {
                hs.add(n.data);
                previous = n;
            }
            n=n.next;
        }
    }


}
