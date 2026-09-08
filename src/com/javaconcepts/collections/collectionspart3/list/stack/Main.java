package com.javaconcepts.collections.collectionspart3.list.stack;

import java.util.Stack;

// Stack is a synchronized, thread-safe LIFO collection.
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
    }
}
