package com.javaconcepts.collections.collectionspart3.threadsafe.concurrentlinkeddeque;

import java.util.concurrent.ConcurrentLinkedDeque;

// Thread safeVersion of Array Deque
public class Main {
    public static void main(String[] args) {

        // Create a thread-safe array deque
        ConcurrentLinkedDeque<Integer> ob = new ConcurrentLinkedDeque<>();

        // Add elements to the array deque
        ob.addFirst(2);
        ob.addLast(1);

        System.out.println(ob.removeLast());
    }
}
