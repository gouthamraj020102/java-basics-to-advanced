package com.javaconcepts.collections.collectionspart3.threadsafe.priorityblockingqueue;

import java.util.concurrent.PriorityBlockingQueue;

// Thread safeVersion of Priority Queue
public class Main {
    public static void main(String[] args) {

        // Create a thread-safe priority queue
        PriorityBlockingQueue<Integer> priorityQueue = new PriorityBlockingQueue<>();

        // Add elements to the priority queue
        priorityQueue.add(5);
        priorityQueue.add(2);

        System.out.println(priorityQueue.peek());
    }
}
