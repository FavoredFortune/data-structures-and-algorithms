public class HasLoop extends LinkedList {
    public boolean hasLoop() {
        ListNode pointerNodeA = this.root;
        ListNode pointerNodeB = this.root;

        boolean isLoop = false;

        //this if case makes sure that there is more than one item in the linked list
        if (this.root.next != null) {

            //my original attempt had a for loop with two conditionals but one was incorrect
            //thanks to classmate Brandon Fenty for reference to his solution at
            //https://github.com/brandon-fenty/data-structures-and-algorithms/blob/master/src/day09/HasLoop.java

            //this while loop ensures that the iteration only occurs while
            // there are values available to both pointers
            while (pointerNodeA.next != null && pointerNodeB.next != null) {

                //increments second pointer to be two steps ahead of the first pointer
                //this helps check for any loops
                pointerNodeA = pointerNodeA.next;
                pointerNodeB = pointerNodeB.next.next;

                //if two pointer data values are equal, after being incremented
                //there is a loop
                if (pointerNodeA == pointerNodeB) {
                    isLoop = true;
                    return isLoop;
                }
            }
        }
        //if no loop is detected, return original value of false
        return isLoop;
    }
}