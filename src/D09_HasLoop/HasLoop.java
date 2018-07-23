package D09_HasLoop;
import D06_Insertions.*;

public class HasLoop extends LinkedList {
    public boolean hasLoop() {
        ListNode pointerNodeA = this.root;
        ListNode pointerNodeB = this.root;

        boolean isLoop = false;

        while (pointerNodeA!= null) {
            if (pointerNodeA.next == pointerNodeB.next || pointerNodeA == pointerNodeB){
                isLoop = true;
                return isLoop;
            }
            pointerNodeA = pointerNodeA.next;
            pointerNodeB = pointerNodeB.next.next;
        }
        return isLoop;
    }
}


