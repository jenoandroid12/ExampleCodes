package com.example.example.ArrayMatrix;

public class RecursiveRemoveDuplicates {

    static int removeDuplicates(int arr[], int n) {


        int[] temp = new int[n];

        int j = 0;
        for (int i = 0; i < n - 1; i++) {

            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[n - 1];

        // Modify original array
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];

        // Return, if array is empty
        // or contains a single element

        if (n == 0 || n == 1) {
            return n;
        } else {
            removeDuplicates(arr, n - 2);
        }
        return j;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;

        n = removeDuplicates(arr, n);

        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}
