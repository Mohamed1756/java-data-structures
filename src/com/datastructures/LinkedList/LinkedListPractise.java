package com.datastructures.LinkedList;

import com.datastructures.StacksAndQueues.WorkingWithQueues;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class LinkedListPractise {
    public static void main(String[] args) {
         //creating Linked list
        LinkedList<Person> linkedList = new LinkedList<>();
        //adding elements into linked list
        linkedList.add(new Person("Alex", 33));
        linkedList.add(new Person("Aby", 13));
        linkedList.add(new Person("Ax", 43));

        // getting linked list to print values in it - forward / backwared
        ListIterator<Person> listIterator = linkedList.listIterator();

        // print Linkedlist while it has next elements
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println();

        // print Linkedlist in reverse
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        // main difference against queues is that linked list allow to addFirst / Last
        linkedList.addLast(new Person("Andy",77));
    }

    private static void queues() {
        Queue<WorkingWithQueues.Person> supermarket = new LinkedList<>();
        // adding element(name/age) of people in the queue
        supermarket.add(new WorkingWithQueues.Person("Mo",23));
        supermarket.add(new WorkingWithQueues.Person("Moh",13));
        supermarket.add(new WorkingWithQueues.Person("Moe",25));

        // print first element in queue
        System.out.println(supermarket.peek());
        //remove first element
        System.out.println(supermarket.poll());
        //display length of queue
        System.out.println(supermarket.size());
    }

    // reusable method;
    static record Person(String name, int age){
    }
}
