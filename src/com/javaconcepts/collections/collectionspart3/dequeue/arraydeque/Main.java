package com.javaconcepts.collections.collectionspart3.dequeue.arraydeque;

import java.util.ArrayDeque;

// Demonstrates the usage of ArrayDeque as a Queue and Stack
public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDequeAsQueue = new ArrayDeque<>();

        // FIFO (First In First Out) behavior of ArrayDeque
        // Insertion of elements in the ArrayDeque
        arrayDequeAsQueue.addLast(1);
        arrayDequeAsQueue.addLast(5);
        arrayDequeAsQueue.addLast(10);

        // Deletion of elements from the ArrayDeque
        int queueElement = arrayDequeAsQueue.removeFirst();
        System.out.println("Removed element: " + queueElement);

        // LIFO (Last In First Out) behavior of ArrayDeque
        ArrayDeque<Integer> arrayDequeAsStack = new ArrayDeque<>();
        arrayDequeAsStack.addFirst(1);
        arrayDequeAsStack.addFirst(5);
        arrayDequeAsStack.addFirst(10);

        // Deletion of elements from the ArrayDeque
        int stackElement = arrayDequeAsStack.removeFirst();
        System.out.println("Removed element from stack: " + stackElement);
    }
}
