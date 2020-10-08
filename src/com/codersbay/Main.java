package com.codersbay;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Queues");

        GQueue queue = new GQueue();

        //PUSH and POP TEST
        System.out.println("enqueue and dequeue test:");
        System.out.println("push 0-9");
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue.toString());

        System.out.println("enqueue " + (queue.size() / 2));
        // Try bercause of the exception
        int[] helpArray = new int[queue.size() / 2];
        try {
            helpArray = queue.dequeue(queue.size() / 2);
        } catch (QueueTooSmallException e) {
            e.printStackTrace();
        }
        System.out.println(queue.toString());
        System.out.print("return value: ");
        System.out.println(Arrays.toString(helpArray));
        System.out.println("enqueue one element");
        int helpInt = 0;
        try {
            helpInt = queue.dequeue();
        } catch (QueueTooSmallException e) {
            e.printStackTrace();
        }
        System.out.println(queue.toString());
        System.out.println("return value: " + helpInt);

        //SIZE TEST
        System.out.println("size test");
        System.out.println(queue.toString());
        System.out.println("size " + queue.size());

    }

}
