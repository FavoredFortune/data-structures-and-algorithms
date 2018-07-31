//package D06_Insertions;
//
//public class Insertion {
//    public ListNode root;
//
//    public static void main(String[] args) {
//    }
//
//    public void  prepend (int value){
//        ListNode node = new ListNode(value);
//        node.next = this.root;
//        this.root = node;
//    }
//
//    //method that adds a new node with the given newValue at the end of the linked List
//    public void append(int newValue) {
//
//        //create the new value node passed in with the parameter "newValue" to refer to in the method
//        ListNode newNodeValue = new ListNode(newValue);
//
//        //mark the current starting point of the LinkedList so while loop can go through each node in the list to
//        // find where to insert the new value
//        ListNode current = this.root;
//
//        //handle special case if the linked list is empty
//        if(this.root == null){
//            this.root = newNodeValue;
//        }
//
//        while (current.next != null) {
//            current = current.next;
//        }
//        newNodeValue.next = current;
//        current.next = newNodeValue;
//    }
//
//    //method that adds a new node with the given newValue immediately before the selected value
//    public void insertBefore(int value, int newValue) {
//
//    //create the new value node passed in with the parameter "newValue" to refer to in the method
//    ListNode newNodeValue = new ListNode(newValue);
//
//    //mark the current starting point of the LinkedList so while loop can go through each node in the list to
//    // find where to insert the new value
//    ListNode current = this.root;
//
//    //handle special case if the target is at the end of the list handle this special case
//    if (this.root.data == value){
//        this.prepend(value);
//    }
//    while (current.next !=null && current.next.data != value) {
//        current = current.next;
//    }
//    newNodeValue.next = current.next;
//    current.next = newNodeValue;
//}
//    //method that adds a new node with the given newValue immediately after an existing value in the list.
//    // value: mut be existing value in the list.
//    // newValue: a new value to add to the list.
//    public void insertAfter(int value, int newValue){
//        ListNode node = new ListNode(newValue);
//
//        ListNode current = this.root;
//        while (current.data != value){
//             current = current.next;
//        }
//        node.next = current.next;
//        current.next = node;
//    }
//}
