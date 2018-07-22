package D10_Reverse;
import D06_Insertions.LinkedList;
import D06_Insertions.ListNode;

public class Reverse extends LinkedList {
    public ListNode previous = null;
    public ListNode current = root;
    public ListNode next = current.next;

    //moved to LinkedList for testing
//    public LinkedList reverseLinkedList(){
//
//        while (current !=null){
//            if(next == null){
//                return list;
//            }
//            current.next = previous;
//            previous = current;
//            current = next;
//            next = next.next;
//        }
//        return list;
//    }
}
