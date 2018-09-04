import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueWithStacksTest {

    @Test
    public void enqueueEmptyTest() {
        QueueWithStacks qq = new QueueWithStacks();

        String actual = qq.toString();
        String expected = "[]";

        assertEquals(expected, actual);
    }

    @Test
    public void enqueueWithValuesSmallTest() {
        QueueWithStacks qq = new QueueWithStacks();
        qq.enqueue(14);
        qq.enqueue(7);
        qq.enqueue(21);

        String actual = qq.toString();
        String expected = "[14, 7, 21]";

        assertEquals(expected, actual);
    }

    @Test
    public void enqueueWithValuesLargeTest() {
        QueueWithStacks qq = new QueueWithStacks();
        qq.enqueue(14);
        qq.enqueue(7);
        qq.enqueue(21);
        qq.enqueue(38);
        qq.enqueue(5);
        qq.enqueue(66);

        String actual = qq.toString();
        String expected = "[14, 7, 21, 38, 5, 66]";

        assertEquals(expected, actual);
    }

    @Test
    public void dequeueSmallTest() {
        QueueWithStacks qq = new QueueWithStacks();
        qq.enqueue(4);
        qq.enqueue(7);
        qq.enqueue(21);

        Integer actual = qq.dequeue();
        Integer expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void dequeueDoubleTest() {
        QueueWithStacks qq = new QueueWithStacks();
        qq.enqueue(4);
        qq.enqueue(7);
        qq.enqueue(21);

        Integer actual1 = qq.dequeue();
        Integer actual = qq.dequeue();
        Integer expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void dequeueQuadrupleTest() {
        QueueWithStacks qq = new QueueWithStacks();
        qq.enqueue(4);
        qq.enqueue(7);
        qq.enqueue(17);
        qq.enqueue(21);
        qq.enqueue(33);
        qq.enqueue(8);

        qq.dequeue();
        qq.dequeue();
        qq.dequeue();
        Integer actual = qq.dequeue();
        Integer expected = 21;

        assertEquals(expected, actual);
    }
}