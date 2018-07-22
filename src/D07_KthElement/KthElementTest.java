package D07_KthElement;

import D06_Insertions.LinkedList;
import D06_Insertions.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class KthElementTest {

    @Test
    void kthElement() {
        LinkedList l5 = new LinkedList();
        l5.prepend(11);
        l5.prepend(122);
        l5.prepend(17);
        l5.prepend(9);
        l5.prepend(5);

        ListNode actual = l5.kthElement(2);
        ListNode expected = l5.root.next.next;

        assertEquals(expected,actual);
    }

}