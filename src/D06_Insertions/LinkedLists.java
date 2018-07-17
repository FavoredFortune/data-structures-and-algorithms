package D06_Insertions;

public class LinkedLists {
    ListNode root;
    ListNode data;
    ListNode next;

    public LinkedList() {
        this.root = null;
    }
    public void prepend(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = this.root;
        this.root = nn;
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
        int new = 0;
        ListNode current = this.root;

        while (new < index) {
            new++;
            current = current.next;
        }
        return current.data;
    }
}

