package D08_MergeLinkedLists;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergedLinkedListsTest {
    LinkedList listA = new LinkedList();
    LinkedList listB = new LinkedList();

    //using the 3 tests cases noted in the whiteboard overview
    @Test
    void mergeListsSmallListsTest() {
        listA.prepend(1);
        listA.prepend(7);
        listB. prepend(4);
        listB. prepend(9);

        LinkedList expected = new LinkedList();

        expected.prepend(4);
        expected.prepend(1);
        expected.prepend(9);
        expected.prepend(7);

        LinkedList actual = MergedLinkedLists.mergeLists(listA, listB);

        assertEquals(expected.toString(),actual.toString());
    }

    @Test
    void mergeListsUnevenTest1() {
        listA.prepend(1);
        listA.prepend(7);


        listB.prepend(4);
        listB.prepend(12);
        listB.prepend(19);


        LinkedList expected = new LinkedList();
        expected.prepend(4);
        expected.prepend(12);
        expected.prepend(1);
        expected.prepend(19);
        expected.prepend(7);

        LinkedList actual = MergedLinkedLists.mergeLists(listA, listB);

        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void mergeListsUnevenTest2() {
        listB.prepend(1);
        listB.prepend(7);


        listA.prepend(4);
        listA.prepend(12);
        listA.prepend(19);


        LinkedList expected = new LinkedList();
        expected.prepend(4);
        expected.prepend(1);
        expected.prepend(12);
        expected.prepend(7);
        expected.prepend(19);

        LinkedList actual = MergedLinkedLists.mergeLists(listA, listB);

        assertEquals(expected.toString(), actual.toString());
        }
    }