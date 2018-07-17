package D06_Insertions;

public class Insertion {

}

//which adds a new node with the given value to the end of the list
private void LinkedList append(int value){
    ListNode newEndList = new ListNode(data);
    newSize = newEndList.size() +1;
    newEndList.next = newSize;


}

//method that adds a new node with the given newValue immediately before the first value node
private void LinkedList insertBefore(int newValue){
        ListNode newRootList = new ListNode(newValue);
        newRootList.next = this.root;
        this.root = newRootList;
}

//method that adds a new node with the given newValue immediately after the first value node
private void LinkedList insertAfter(int value, int newValue){

}

////stretch goal
//Method that deletes a value from the list
//private void LinkedList deleteValue(int value, int goneValue){
//
//}
