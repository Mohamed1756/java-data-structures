package com.datastructures.arrays;
import java.util.Arrays;

public class Arrays1D {

    public static void main(String[] args) {
        // String array; initialize it; then specify size
        // array now has 4 spaces; Arrays start from 0th index
        String [] colors = new String[4];

        //Adding elements
        colors[0] = "Red";
        colors[1] = "Green";
        colors[2] = "Purple";

        // to output an array - use Arrays class with .toString
        System.out.println(Arrays.toString(colors));

        //to print element at a particular index
        System.out.println(colors[1]);
        // shortcut; use this when you know elements in array; cant change size
        int[] numbers = {123,22,33};
        // loop through Array; displaying elements
        for (int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }
        //reverse elements in array; set start position to end on array - then decrement
        for (int i = colors.length-1; i >= 0; i--){
            System.out.println(colors[i]);
        }

        //array.length - displays size of Array
        System.out.println(colors.length);

        //searching through Array using a for-each loop
        // for(assign var : initial array)
        for(String color : colors){
            System.out.println(color);
        }
    }

}
