//package D06_Insertions;
//import org.junit.jupiter.api.Test;
//
//
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class LinkedListTest {
//    public LinkedList empty;
//    public LinkedList l1;
//    public LinkedList l2;
//    public LinkedList l4;
//    public LinkedList repeated;
//
//    @org.junit.jupiter.api.BeforeEach
//    void setUp() {
//        empty  = new LinkedList();
//        empty.append;
//
//        l1 = new LinkedList();
//        l1.prepend(12);
//
//        l2 = new LinkedList();
//        l2.prepend(14);
//        l2.prepend(12);
//
//        l4 = new LinkedList();
//        l4.prepend(45);
//        l4.prepend(92);
//        l4.prepend(19);
//        l4.prepend(12);
//
//        repeated = new LinkedList();
//        repeated.prepend(4);
//        repeated.prepend(3);
//        repeated.prepend(3);
//        repeated.prepend(1);
//    }
//
//    @Test
//    void toStringEmptyListTest() {
//        assertEquals("[]", empty.toString());
//    }
//
//    @Test
//    void toStringOneItemTest() {
//        assertEquals("[12]", l1.toString());
//    }
//
//    @Test
//    void toStringTwoItemTest() {
//        assertEquals("[12, 14]", l2.toString());
//    }
//
//    @Test
//    void toStringFiveItemTest() {
//        assertEquals("[12, 19, 92, 45]", l4.toString());
//    }
//
//    @Test
//    void insertBeforeEmptyTest() {
//        empty.insertBefore(2,22);
//        assertEquals("[]", empty.toString());
//    }
//
//    @Test
//    void insertBeforeOneTest() {
//        repeated.insertBefore(3,2);
//        assertEquals("[1, 2, 3, 3, 4]", repeated.toString());
//    }
//
//    @Test
//    void insertBeforeTwoTest() {
//        l4.insertBefore(92,22);
//        assertEquals("[12, 19, 22, 92, 45]", l4.toString());
//    }
//    @Test
//    void insertAfterEmptyTest() {
//        empty.insertAfter(2,22);
//        assertEquals("[]", empty.toString());
//    }
//
//    @Test
//    void insertAfterOneTest() {
//        repeated.insertAfter(3,2);
//        assertEquals("[1, 3, 2, 3, 4]", repeated.toString());
//    }
//
//    @Test
//    void insertAfterTwoTest() {
//        l4.insertAfter(92,22);
//        assertEquals("[12, 19, 92, 22, 45]", l4.toString());
//    }
//
//    @Test
//    void appendOneTest() {
//        repeated.append(5);
//        assertEquals("[1, 3, 3, 4, 5]", repeated.toString());
//    }
//
//    @Test
//    void appendTwoTest() {
//        l4.append(77);
//        assertEquals("[12, 19, 92, 45, 77]", l4.toString());
//    }
//
//    @Test
//    void appendThreeTest() {
//        l2.append(7);
//        assertEquals("[12, 14, 7]", l2.toString());
//    }
//}