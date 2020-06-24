import _1_WhyGenerics.GenericCircularBuffer;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class GenericCircularBufferTest
{
    private GenericCircularBuffer<Integer> buffer = new GenericCircularBuffer<>(2);

    @Test
    public void shouldOfferPollableElement()
    {
        assertTrue(buffer.offer(1));

        assertEquals(Integer.valueOf(1), buffer.poll());
    }

    @Test
    public void shouldNotOfferWhenBufferIsFull()
    {
        assertTrue(buffer.offer(1));
        assertTrue(buffer.offer(2));
        assertFalse(buffer.offer(3));
    }

    @Test
    public void shouldNotPollWhenBufferIsEmpty()
    {
        assertNull(buffer.poll());
    }

    @Test
    public void shouldRecycleBuffer()
    {
        assertTrue(buffer.offer(1));
        assertTrue(buffer.offer(2));
        assertEquals(Integer.valueOf(1), buffer.poll());
        assertTrue(buffer.offer(3));
        assertEquals(Integer.valueOf(2), buffer.poll());
        assertEquals(Integer.valueOf(3), buffer.poll());
    }
}
