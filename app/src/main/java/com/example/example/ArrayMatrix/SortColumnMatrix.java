package com.example.example.ArrayMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class SortColumnMatrix {

    static void sortMat(int mat[][], int n) {


        int i, j, a, k;


        for (j = 0; j < n; ++j) {

            for (i = 0; i < n; ++i) {

                for (k = i + 1; k < n; ++k) {

                    if (mat[i][j] > mat[k][j]) {

                        a = mat[i][j];

                        mat[i][j] = mat[k][j];

                        mat[k][j] = a;

                    }

                    System.out.print("ROW" + " " + j + " ");
                    System.out.print("COL" + " " + j + " ");
                    System.out.print("ROW2" + " " + k + " ");
                    System.out.print("COL2" + " " + j + " ");
                    System.out.println();

                }

            }

        }

    }

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Column Matrix");
        System.out.println("Enter The Number Of Matrix Rows");

        int matrixRow = scan.nextInt();

        System.out.println("Enter The Number Of Matrix Columns");

        int matrixCol = scan.nextInt();

        int[][] matrix = new int[matrixRow][matrixCol];

        System.out.println("Enter Matrix Data");

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();
        }

        int n = matrix.length;
        sortMat(matrix, n);

        System.out.println("Matrix After Sorting:");
        for (int u = 0; u < n; u++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[u][j] + " ");
            System.out.println();
        }


    }
}
