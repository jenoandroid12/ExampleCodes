package com.example.example.ArrayMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class RecursiveSort {

    static void recurSort(int arr[], int n) {

        if (n != 0) {


            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swap arr[i], arr[i+1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            recurSort(arr, n - 1);
        }

    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 1};

        recurSort(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        ArrayList<String> llist = new ArrayList<>();
        llist.add("Name");
        llist.add("John");
        llist.add("Apple");
        llist.add("Baby");
        llist.add("Baby");

        Collections.sort(llist);


        for (int i=0;i<1;i++){
            System.out.println(llist);
        }

    }
}
