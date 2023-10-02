package com.ds.create;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysCreation {
    public static void main(String[] args) {

        String[] stringArray = new String[3];
        //declare and initialize and array
        int[] age = {12, 4, 5, 2};

        for(int i = 0; i < age.length; i++) {
            System.out.printf("'%s'",age[i]);
        }
        for(int a : age) {
            System.out.printf("'%s'",a);
        }

        Arrays.stream(age).forEach(System.out::println);

        //Arrays to List
        Integer[] numbers = new Integer[] { 1, 2, 3 };
        List<Integer> list = Arrays.asList(numbers);
        // UnsupportedOperationException
        // list.add(7);

        //Work only on int type
        Arrays.stream(age)
                .boxed()// returns the IntStream
                .collect(Collectors.toList());

        //Unmodifiable list - Java 16
        Arrays.stream(age).boxed().toList();

        ArrayList<Integer> listOfIntegers = Arrays.stream(numbers)
                .collect(Collectors.toCollection(ArrayList::new));

        //Java 9 -  immutable list
        String[] objects = {"Apple", "Ball", "Cat"};
        List<String> objectList = List.of(objects);

        // Using mapToObj you can covert each int element into string stream, char stream etc. by casing i to (char)i
        List<Integer> givenIntArray2 = Arrays.stream(age)
                .mapToObj(i->i)
                .collect(Collectors.toList());

        List<Character> givenIntArray3 = Arrays.stream(age)
                .mapToObj(i->(char)i)
                .collect(Collectors.toList());
    }
}
