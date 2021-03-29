package app.linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Ex2_2_test {

    private Ex2_2 ex2_2 = new Ex2_2();

    @Test
    public void withOutOfScopeK() {
        assertNull(ex2_2.printKthToLast(LinkedListNode.of(1, 2, 3), 3));
    }

    @Test
    public void withZero() {
        assertEquals(3, ex2_2.printKthToLast(LinkedListNode.of(1, 2, 3), 0));
    }

    @Test
    public void withNoneZero() {
        assertEquals(2, ex2_2.printKthToLast(LinkedListNode.of(1, 2, 3), 1));
    }

}
