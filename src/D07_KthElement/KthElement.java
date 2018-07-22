package D07_KthElement;
import D06_Insertions.*;

//all code thanks to rewatching lecture review and seeing fellow students solutions
public class KthElement extends LinkedList{
    ListNode root;

    public ListNode kthElement(int k){
        this.root = null;
        ListNode current = this.root;

        //count total number of nodes in Linked List
        int total = 0;
        while (current !=null){
            total++;
            current = current.next;
        }
        current = this.root;

        //move through list again but stop with the count K nodes
        // ahead from the counted total
        int cycle = 0;
        while (cycle != total -k){
            current = current.next;
            cycle++;
        }
        return current;
    }


}
