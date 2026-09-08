package com.javaconcepts.collections.collectionspart3.list.linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList1 = new LinkedList<>();

        // using deque functionality
        linkedList1.addLast(200);
        linkedList1.addLast(300);
        linkedList1.addLast(400);
        linkedList1.addFirst(100);
        System.out.println(linkedList1.getFirst());

        // using list functionality
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(0, 100);
        linkedList2.add(1, 300);
        linkedList2.add(2, 400);
        linkedList2.add(1, 200);
        System.out.println(linkedList2.get(1) + " and " + linkedList2.get(2));

        System.out.println(linkedList1);
        System.out.println(linkedList2);
    }
}
