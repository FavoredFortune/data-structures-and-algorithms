package D06_Insertions;

public class Insertion {
    private final ListNode root;

    public static void main(String[] args) {

    }

}

//which adds a new node with the given value to the end of the list
public void LinkedLists append(int value) {
    ListNode newNode = ListNode(value);
    ListNode current = 0


}
//method that adds a new node with the given newValue immediately before the first value node
public void LinkedLists insertBefore(int value, int newValue) {

//    //create the original value node passed in with the parameter "value" to refer to in the method

    //create the new value node passed in with the parameter "newValue" to refer to in the method
    ListNode newNodeValue = new ListNode(newValue);

    //mark the current starting point of the LinkedList so while loop can go through each node in the list to
    // find where to insert the new value
    ListNode current = this.root;
    while (current.data != value) {
        current = current.next;
    }
    newNodeValue.next = current.next;
    current.next = newNodeValue;
}

//method that adds a new node with the given newValue immediately after the first value node
private void LinkedLists insertAfter(int value, int newValue){

}

////stretch goal
//Method that deletes a value from the list
//private void LinkedLists deleteValue(int value, int goneValue){
//
//}
