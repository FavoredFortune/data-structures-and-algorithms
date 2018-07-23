package D06_Insertions;

//instantiate this parent class with properties to help manipulate linked lists for the insertion tasks
public class LinkedLists {
    public ListNode root;

    //establish that when a linked list is first created it is empty
    public LinkedLists() {
        this.root = null;
    }

    //this method, as part of the LinkedLists class, helps to put a new value at the root of a linked list
    public void  prepend (int value){
        ListNode node = new ListNode(value);
        node.next = this.root;
        this.root = node;
    }

    //method that adds a new node with the given newValue at the end of the linked List
    public ListNode append(int newValue) {

        //create the new value node passed in with the parameter "newValue" to refer to in the method
        ListNode newNodeValue = new ListNode(newValue);

        //mark the current starting point of the LinkedList so while loop can go through each node in the list to
        // find where to insert the new value
        ListNode current = this.root;

        //handle special case if the linked list is empty
        if(current == null){
            current = newNodeValue;
            return current;
        }

        while (current.next != null) {
            current = current.next;
        }
//        newNodeValue.next = current;
        current.next = newNodeValue;
        return newNodeValue;
    }

    //for testing and other possible print needs, makes linked lists print out in easy-to-read format for humans
    //technically this overrides the built in String Object/Class that is a subclass of Object in Java
    public String toString(){

        //provides return for exception case of an empty link list
        if(this.root == null){
            return "[]";
        }

        //creates an empty string variable to store linked list data values in with the below while loop
        String result = "";

        //for loop, starts the loop at the root/head of the linked list to pull data values from to add
        //to the string result output
        ListNode current = this.root;

        //this while loop goes through every item in the linked list sequentially, until the list ends and
        //adds each data value from each node in the linked list to a string result
        while (current != null){
            result += current.data;
            if(current.next != null){
                result += ", ";
            }
            current = current.next;
        }
        //returns final compiled string of all values within a linked list
        return "[" + result + "]";
    }

    //to create or change a linked list to an empty linked list
    public boolean isEmpty() {
        return this.root == null;
    }

    //to generate the size (total number of nodes) of the linked list, much like the .length property of an array
    public int size() {
        int total = 0;
        ListNode current = this.root;

        //while loop counts each node in the linked list and returns the total after the while loop is complete.
        while (current != null) {
            total++;
            current = current.next;
        }
        return total;
    }

    //method that adds a new node with the given newValue immediately before the selected value
    public void insertBefore(int value, int newValue) {

        //create the new value node passed in with the parameter "newValue" to refer to in the method
        ListNode newNodeValue = new ListNode(newValue);

        //mark the current starting point of the LinkedList so while loop can go through each node in the list to
        // find where to insert the new value
        ListNode current = this.root;

        //handle special case if the linked list is empty
        if(this.root == null){
            System.out.println("Sorry this linked list is empty. Requested action can't be taken");
            return;
        }

        //handle special case if the target is at the end of the list handle this special case
        if (this.root.data == value){
            this.prepend(value);
        }

        while (current.next !=null && current.next.data != value) {
            current = current.next;
        }
        newNodeValue.next = current.next;
        current.next = newNodeValue;
    }
    //method that adds a new node with the given newValue immediately after an existing value in the list.
    // value: mut be existing value in the list.
    // newValue: a new value to add to the list.
    public void insertAfter(int value, int newValue){
        ListNode newNodeValue = new ListNode(newValue);

        //handle special case if the linked list is empty
        if(this.root == null){
            System.out.println("Sorry this linked list is empty. Requested action can't be taken");
            return;
        }

        ListNode current = this.root;
        while (current.data != value){
            current = current.next;
        }
        newNodeValue.next = current.next;
        current.next = newNodeValue;
    }

    //adding here for testing - not clear why needed when I extended the class but there it is
    public ListNode kthElement(int k){
        ListNode node = new ListNode(k);
        ListNode current =root;

        //count total number of nodes in Linked List
        int total = 0;
        while (current !=null){
            total++;
            current = current.next;
        }

        //move through list again but stop with the count K nodes
        // ahead from the counted total
        int cycle =total - (k+1);
        current = root;
        if(cycle == 0){
            node =current;
        } else {
            for (int i = 0; i < cycle; i++){
                current = current.next;
                node = current;
            }
        }
        return node;
    }

}

