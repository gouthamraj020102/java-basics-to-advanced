package com.javaconcepts.collections.collectionspart3.list.threadsafe.copyonwritearraylist;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * CopyOnWriteArrayList is a thread-safe list.
 *
 * Reading is fast and safe because readers use the existing array.
 * Every change, such as add(), set(), or remove(), creates a new array.
 *
 * Use it when reads happen much more often than writes.
 * Avoid it for large lists or frequent modifications because copying is costly.
 *
 * Iterators use a snapshot, so later changes are not seen during iteration.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(0, 100);
        System.out.println(list.get(0));
    }
}
