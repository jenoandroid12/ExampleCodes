package com.example.example.ArrayMatrix;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort2DArray {

    static void sortMat(int mat[][], int n) {

        for (int r1 = 0; r1 < n; r1++) {
            for (int c1 = 0; c1 < n; c1++) {
                int c = c1 + 1;
                for (int r = r1; r < n; r++) {
                    while (c < n) {
                        if (mat[r1][c1] > mat[r][c]) {
                            int tmp = mat[r][c];
                            mat[r][c] = mat[r1][c1];
                            mat[r1][c1] = tmp;

                        }
                        c++;
                    }
                    c = 0;
                }
            }
        }

    }

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The Number Of Matrix Rows");

        int matrixRow = scan.nextInt();

        System.out.println("Enter The Number Of Matrix Columns");

        int matrixCol = scan.nextInt();

        int[][] matrix = new int[matrixRow][matrixCol];

        int[][] sortCol = new int[matrixRow][matrixCol];

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


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sortCol[i][j] = matrix[j][i];
//                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(sortCol[i][j] + " ");
            System.out.println();
        }


    }
}
