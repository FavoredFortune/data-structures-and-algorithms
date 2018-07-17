package D06_Insertions;

public class LinkedLists {
    ListNode root;
    ListNode data;
    ListNode next;


    public LinkedLists() {
        this.root = null;
    }


    public void append (int data){
        ListNode newEndList = new ListNode(data);
        newSize = newEndList.size() +1;
        newEndList.next = newSize;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public int size() {
        int total = 0;

        ListNode current = this.root;
        while (current != null) {
            total++;
            current = current.next;
        }
        return total;
    }

    public int get(int index) {
        int n = 0;
        ListNode current = this.root;

        while (n < index) {
            n++;
            current = current.next;
        }
        return current.data;
    }
}

