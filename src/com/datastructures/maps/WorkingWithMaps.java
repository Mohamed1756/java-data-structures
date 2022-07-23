package com.datastructures.maps;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {

    public static void main(String[] args) {
        //creating Map
        Map<Integer,Person>map = new HashMap<>();

        // adding elements to map - NO DUPLICATES
        map.put(1,new Person("Ali"));
        map.put(2,new Person("ime"));
        map.put(3,new Person("Alex"));
        // print map
        System.out.println(map);
        //check size
        System.out.println(map.size());
        //get index position
        System.out.println(map.get(2));
        //check contains - key or value
        System.out.println(map.containsKey(4));
        //print keys
        System.out.println(map.keySet());
        // loop out elements
        map.entrySet().forEach(System.out::println);

        //remove
        map.remove(2);

        //get or default - i.e. if not present
        System.out.println(map.getOrDefault(4,new Person("default")));

    }

    //reusable method
    public record Person(String name){
    }
}
