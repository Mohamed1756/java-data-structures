package com.datastructures.StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    

    public static void main(String[] args) {
       // creating a queue using a Linked List
        Queue<Person> supermarket = new LinkedList<>();
        // adding element(name/age) of people in the queue
        supermarket.add(new Person("Mo",23));
        supermarket.add(new Person("Moh",13));
        supermarket.add(new Person("Moe",25));

        // print first element in queue
        System.out.println(supermarket.peek());
        //remove first element
        System.out.println(supermarket.poll());
        //display length of queue
        System.out.println(supermarket.size());
    }

    // reusable method;
    public static record Person(String name, int age){
    }
   
}
