//package D10_Reverse;
//
//import D06_Insertions.LinkedList;
//import D06_Insertions.ListNode;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//class LinkedListTest{
//
//    public LinkedList setupFive(){
//        LinkedList five = new LinkedList();
//        five.prepend(14);
//        five.prepend(7);
//        five.prepend(3);
//        five.prepend(24);
//        five.prepend(86);
//        System.out.println(five);
//
//        return five;
//    }
//
//    @Test
//    public void reverseLinkedList5Test() {
//
//        LinkedList result = setupFive();
//        LinkedList expected = result.reverseLinkedList();
//        System.out.println(expected);
//        LinkedList actual = new LinkedList();
//        actual.prepend(86);
//        actual.prepend(24);
//        actual.prepend(3);
//        actual.prepend(7);
//        actual.prepend(14);
//        assertEquals(expected.toString(),actual.toString());
//    }
//
//    public LinkedList setUpTwo(){
//        LinkedList two = new LinkedList();
//        two.prepend(17);
//        two.prepend(9);
//
//        System.out.println(two);
//
//        return two;
//    }
//    @Test
//    public void reverseLinkedList2Test() {
//
//        LinkedList result = setUpTwo();
//        LinkedList expected = result.reverseLinkedList();
//        System.out.println(expected);
//        LinkedList actual = new LinkedList();
//        actual.prepend(9);
//        actual.prepend(17);
//        assertEquals(expected.toString(),actual.toString());
//    }
//
//    public LinkedList setUpOne(){
//        LinkedList one = new LinkedList();
//        one.prepend(4);
//
//        System.out.println(one);
//
//        return one;
//    }
//    @Test
//    public void reverseLinkedList1Test() {
//
//        LinkedList result = setUpOne();
//        LinkedList expected = result.reverseLinkedList();
//        System.out.println(expected);
//        LinkedList actual = new LinkedList();
//        actual.prepend(4);
//        assertEquals(expected.toString(),actual.toString());
//    }
//
//}