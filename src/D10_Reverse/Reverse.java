package D10_Reverse;
import D06_Insertions.LinkedList;
import D06_Insertions.ListNode;

public class Reverse extends LinkedList {

    //moved to LinkedList for testing
    //solution inspired by https://stackoverflow.com/questions/22605050/reverse-singly-linked-list-java
    //see LinkedList class in D06_Insertions package lines 91-106
    //also below for reference, but test is based off code on LinkedList class at address noted above.
    public LinkedList reverseLinkedList(){

        ListNode previous = null;
        ListNode theNextNode = null;
        ListNode root = this.root;
        ListNode nodeWeAreOnNow = root;

        while (nodeWeAreOnNow !=null){
            theNextNode = nodeWeAreOnNow.next;
            nodeWeAreOnNow.next = previous;
            previous = nodeWeAreOnNow;
            nodeWeAreOnNow = theNextNode;
        }
        this.root = previous;
        return this;
    }
}
