package com.datastructures.Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball>balls=new HashSet<>();
        // Use HashSet if order not important. Not get index! As order is not guaranteed.
        balls.add(new Ball("Green"));
        balls.add(new Ball("Red"));balls.add(new Ball("Yellow"));balls.add(new Ball("Orange"));

        //display elements in the set; returns random positions
        balls.forEach(System.out::println);

        System.out.println();
        //TreeSet preserves order - alphabetically/ numerically
        TreeSet<String>orderBall= new TreeSet<>();
        orderBall.add("Green");
        orderBall.add("Red");
        orderBall.add("Yellow");
        orderBall.add("Orange");
        orderBall.forEach(System.out::println);


    }

    record Ball(String color){
        // Method that holds color balls in a bag
    }
}
