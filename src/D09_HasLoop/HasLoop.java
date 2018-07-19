package D09_HasLoop;
import D06_Insertions.*;

    public class LinkedLists {

        public Boolean hasLoop() {
//        LinkedLists testList = new LinkedLists();
        ListNode pointerNodeA = new ListNode(0);
        ListNode pointerNodeB = new ListNode(2);

        while (pointerNodeA.next != null) {
            if (pointerNodeA.next == pointerNodeB.next) {
               pointerNodeA = pointerNodeA.next.next;
               pointerNodeB = pointerNodeB.next;
                return true;
            }
        } return false;
    }
}



