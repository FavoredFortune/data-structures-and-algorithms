package D10_Reverse;

import D06_Insertions.LinkedList;
import D06_Insertions.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static D10_Reverse.Reverse.*;
import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
//    public Reverse setUp() {
//        LinkedList five = new LinkedList();
//        five.prepend(14);
//        five.prepend(7);
//        five.prepend(3);
//        five.prepend(24);
//        five.prepend(86);
//
//        LinkedList empty = new LinkedList();
//
//        LinkedList ll2 = new LinkedList();
//        ll2.prepend(42);
//        ll2.prepend(17);
//
//        LinkedList ll = new LinkedList();
//        ll.prepend(7);
//    }

    public LinkedList setupFive(){
        LinkedList five = new LinkedList();
        five.prepend(14);
        five.prepend(7);
        five.prepend(3);
        five.prepend(24);
        five.prepend(86);
        return five;
    }

    @Test
    public void reverseLinkedList5Test() {

        LinkedList result = setupFive();
        LinkedList expected = reverseLinkedList(result);
        LinkedList actual = new LinkedList();
        actual.prepend(86);
        actual.prepend(24);
        actual.prepend(3);
        actual.prepend(7);
        actual.prepend(14);
        assertEquals(expected,actual);
    }

    private LinkedList reverseLinkedList(LinkedList result) {
            ListNode previous = null;
            ListNode current = result.root;
            ListNode next = current.next;

            while (current !=null){
                if(next == null){
                    return result;
                }
                current.next = previous;
                previous = current;
                current = next;
                next = next.next;
            }
            return result;

    }
}