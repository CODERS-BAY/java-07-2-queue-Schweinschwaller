package com.codersbay;

import java.util.ArrayList;
import java.util.List;

public class GQueue {
    private List<Integer> queue;

    public GQueue() {
        queue = new ArrayList<>();
    }

    //adds a new element to the back of the queue
    public void enqueue(int input) {
        this.queue.add(input);
    }

    //returns the number of elements in the queue
    public int size() {
        return this.queue.size();
    }

    //returns and removes the first element of the snake
    public int dequeue() throws QueueTooSmallException {
        if (this.queue.isEmpty()) {
            throw new QueueTooSmallException("dequeue");
        }
        return this.queue.remove(0);
    }

    //returns and removes the first n elements of the queue
    public int[] dequeue(int n) throws QueueTooSmallException {
        if (n > this.queue.size()) {
            throw new QueueTooSmallException("pop");
        }
        int[] help = new int[n];
        for (int i = 0; i < n; i++) {
            help[i] = this.queue.remove(0);
        }
        return help;
    }

    @Override
    public String toString() {
        String help = "";
        for (int i = 0; i < this.queue.size() - 1; i++) {
            help += this.queue.get(i).toString() + ", ";
        }
        help += this.queue.get(this.queue.size() - 1).toString();
        return help;
    }
}
