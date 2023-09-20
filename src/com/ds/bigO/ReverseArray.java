package com.ds.bigO;

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
    }
}
