package com.datastructures.StacksAndQueues;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        //creating integer stack of objects
        Stack<Integer> stack = new Stack<>();
        //add items
        stack.push(2);
        stack.push(1);
        stack.push(88);
        //find peek element
        System.out.println(stack.peek());
        //find size
        System.out.println(stack.size());

        // remove element, i.e peek
        System.out.println(stack.pop());
        //find new size
        System.out.println(stack.size());

        // check if stack is empty
        System.out.println(stack.isEmpty());

    }
}
