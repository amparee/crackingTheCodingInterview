package app.linkedList;

// You have two numbers represented by a linked list, where each node contains a single
// digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
// function that adds the two numbers and returns the sum as a linked list.

// EXAMPLE
// Input: (7- 1 - 6) + (5 - 9 - 2).That is, 617 + 295.
// Output: 2 - 1 - 9. That is, 912.

// FOLLOW UP
// Suppose the digits are stored in forward order. Repeat the above problem.

// EXAMPLE
// Input: (6 - 1 - 7) + (2 - 9 - 5).That is, 617 + 295.
// Output: 9 - 1 - 2. That is, 912.

public class Ex2_4 {

    public static void main(String[] args) {
        LinkedListNode n1 = LinkedListNode.of(7, 1, 6);
        LinkedListNode n2 = LinkedListNode.of(5, 9, 2);
        Ex2_4 ej = new Ex2_4();
        System.out.println("First approach");
        ej.sumTwoNodes(n1, n2);

        System.out.println("\nCtci result");
        LinkedListNode n3 = ej.addLists(n1,n2,0);
        System.out.println("Ctci result n3 " + n3);

    }

    public int lListToInt(LinkedListNode node) {
        int result = 0;
        String aux = "";
        while (node != null) {
            aux += node.data;
            node = node.next;
        }

        StringBuffer sbr = new StringBuffer(aux);
        aux = sbr.reverse().toString();

        System.out.println(aux);
        result = Integer.valueOf(aux);
        return result;
    }


    public int sumTwoNodes(LinkedListNode first, LinkedListNode second) {

        if (first == null || second == null) {
            return 0;
        }

        int result = 0;
        int intFirst = this.lListToInt(first);
        int intSecond = this.lListToInt(second);
        result = intFirst + intSecond;
        System.out.println("Resultado: " + result);
        return result;

    }

    LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        LinkedListNode result = new LinkedListNode();
        int value = carry;

        if (l1 != null) {
            value += l1.data;
        }

        if (l2 != null) {
            value += l2.data;
        }

        result.data = value % 10; //second digit of number

        //recurse
        if (l1 != null || l2 != null) {
            LinkedListNode more = addLists(l1 == null ? null : l1.next,
                                           l2 == null ? null : l2.next,
                                           value >= 10 ? 1 : 0);
            result.next = more;
        }

        return result;

    }

}
