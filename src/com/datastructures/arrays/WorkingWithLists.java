package com.datastructures.arrays;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {

    public static void main(String[] args) {
        // initializing array
        List <String> colors = new ArrayList<>();
        // to add values
        colors.add("blue");
        colors.add("red");

        System.out.println(colors);
        // find length
        System.out.println(colors.size());
        // contains
        System.out.println(colors.contains("Yellow"));
        //Get index
        System.out.println(colors.get(1));

        //loop & display elements
        for (String color : colors) {
            System.out.println(color);
        }


    }
}
