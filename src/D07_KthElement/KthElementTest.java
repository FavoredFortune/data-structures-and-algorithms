//package D07_KthElement;
//
//import D06_Insertions.LinkedList;
//import D06_Insertions.ListNode;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//
//class KthElementTest {
//
//    @Test
//    public void kthElementTestBigLL() {
//        LinkedLists l5 = new LinkedLists();
//        l5.prepend(11);
//        l5.prepend(122);
//        l5.prepend(17);
//        l5.prepend(9);
//        l5.prepend(5);
//
//        ListNode actual = l5.kthElement(2);
//        ListNode expected = l5.root.next.next;
//
//
//        assertEquals(expected,actual);
//    }
//
//    @Test
//    public void kthElementNearEnd() {
//        LinkedLists lE = new LinkedLists();
//        lE.prepend(11);
//        lE.prepend(122);
//        lE.prepend(17);
//        lE.prepend(9);
//        lE.prepend(5);
//
//        ListNode actual = lE.kthElement(4);
//        ListNode expected = lE.root;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void kthElementNearFront() {
//        LinkedLists lE = new LinkedLists();
//        lE.prepend(11);
//        lE.prepend(122);
//        lE.prepend(17);
//        lE.prepend(9);
//        lE.prepend(5);
//
//        ListNode actual = lE.kthElement(1);
//        ListNode expected = lE.root.next.next.next;
//        assertEquals(expected, actual);
//    }
//
//}