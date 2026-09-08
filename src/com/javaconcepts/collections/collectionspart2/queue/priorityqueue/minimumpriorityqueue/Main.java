package com.javaconcepts.collections.collectionspart2.queue.priorityqueue.minimumpriorityqueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        //min priority queue, used to solve problems of min heap
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(5);
        minPQ.add(2);
        minPQ.add(8);
        minPQ.add(1);

        //lets print all the values
        minPQ.forEach((Integer val) -> System.out.println(val));

        //remove top element from the PQ and print
        while(!minPQ.isEmpty()) {
            int val = minPQ.poll();
            System.out.println("remove from top: " +val);
        }
    }
}
