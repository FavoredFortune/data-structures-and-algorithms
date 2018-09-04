import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HasLoopTest {
    public HasLoop setUpLoopList() {
        //creating looped list code from Steve Geluso, Instructor
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(7);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n2; // point n5 back to n2 to create the loop

        HasLoop loopy = new HasLoop();
        loopy.root  = n1; // attach n1 as the root manually.
        return loopy;
    }

    public HasLoop setUpNotLoopList() {
        HasLoop notLoop = new HasLoop();
        notLoop.prepend(14);
        notLoop.prepend(7);
        notLoop.prepend(3);

        return notLoop;
    }

    public HasLoop setUpEmptyList() {
        HasLoop empty = new HasLoop();
        return empty;
    }

    @Test
    public void hasLoopTestLoopy1() {
        HasLoop result = setUpLoopList();
        boolean actual = result.hasLoop();

        assertEquals(true, actual);
    }

    @Test
    public void hasLoopTestNotLoop1() {
        HasLoop result = setUpNotLoopList();
        boolean actual = result.hasLoop();

        assertEquals(false, actual);
    }

    @Test
    public void hasLoopTestEmptyList() {
        HasLoop result = setUpEmptyList();
        boolean actual = result.hasLoop();

        assertEquals(false, actual);
    }
}

