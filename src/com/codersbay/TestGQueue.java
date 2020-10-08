package com.codersbay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestGQueue {
    @Test
    public void testEnqueueAndSize() {
        GQueue queue = new GQueue();
        queue.enqueue(10);
        assertEquals(queue.size(), 1);
        queue.enqueue(12);
        assertEquals(queue.size(), 2);
        queue.enqueue(10);
        assertEquals(queue.size(), 3);
    }

    @Test
    public void testdequeue() throws QueueTooSmallException {
        GQueue queue = new GQueue();
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        assertEquals(queue.size(), 3);
        assertEquals(queue.dequeue(), 10);
        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);
        int[] popTest = queue.dequeue(3);
        assertEquals(popTest[0], 11);
        assertEquals(popTest[1], 12);
        assertEquals(popTest[2], 13);
    }

    @Test
    public void testQueueTooSmallException() {
        GQueue queue = new GQueue();
        assertThrows(QueueTooSmallException.class, () -> {
            queue.dequeue();
        });
        assertThrows(QueueTooSmallException.class, () -> {
            queue.dequeue(10);
        });
    }
}
