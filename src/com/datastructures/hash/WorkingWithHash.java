package com.datastructures.hash;

import com.datastructures.maps.WorkingWithMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithHash {
    public static void main(String[] args) {
        //creating map - inputting key/value pairs
        Map<Person,Diamond> map = new HashMap<>();
        map.put(new Person("Alex"), new Diamond("Sapphire"));
        map.put(new Person("Jay"), new Diamond("Emerald"));

        // Produces hashcode (unique number) of that element
        System.out.println(new Person("Jamila").hashCode());
        System.out.println(new Person("Jamila").hashCode());
        //displays the diamond that is paired to ALex on the table
        System.out.println(map.get(new Person("Alex")));

    }

    private static void maps() {
        Map<Integer, WorkingWithMaps.Person> map = new HashMap<>();

        // adding elements to map - NO DUPLICATES
        map.put(1,new WorkingWithMaps.Person("Ali"));
        map.put(2,new WorkingWithMaps.Person("ime"));
        map.put(3,new WorkingWithMaps.Person("Alex"));
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
        System.out.println(map.getOrDefault(4,new WorkingWithMaps.Person("default")));
    }

    //Reusable Methods
    static class Person{
        String name;

        //Constructor
        public Person(String name){
            this.name = name;
        }
       //print elements to string
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        //checks for duplicates
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        //allows value to turn into hashcode (numbers)
        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
    record Diamond(String name){}
}
