package com.ds.bigO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        for (int i: arr) {
            System.out.print(i);
        }
        System.out.printf("----");
        for(int i = 0; i < arr.length / 2; i ++) {
            int pointer = arr.length - i - 1;
            int buffer = arr[i];
            arr[i] = arr[pointer];
            arr[pointer] = buffer;
        }
        for (int i: arr) {
            System.out.print(i);
        }
        System.out.println();
        int[] array2 = {2,4,6,8,10};
        List<Integer> numberList = new ArrayList<>();
        numberList = Arrays.stream(array2)
                .boxed()
                .collect(Collectors.toList());
        Collections.reverse(numberList);
        System.out.println(numberList);
    }
}
