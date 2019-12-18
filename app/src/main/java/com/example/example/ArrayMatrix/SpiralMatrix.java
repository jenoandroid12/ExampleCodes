package com.example.example.ArrayMatrix;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Scanner;

public class SpiralMatrix {

   public static void spiralPrint(int row, int column, int a[][]) {
        int i, k = 0, l = 0;
		/* k - starting row index
		l - starting column index
		*/
        System.out.println("Spiral Print");
        while (k < row && l < column) {
            // Print the first row from the remaining rows
            for (i = l; i < column; i++) {
                System.out.print(+a[k][i] + " ");
            }
            k++;

            // Print the last column from the remaining columns
            for (i = k; i < row; i++) {
                System.out.print(a[i][column - 1] + " ");
            }
            column--;

            // Print the last row from the remaining rows */
            if (k < row) {
                for (i = column - 1; i >= l; i--) {
                    System.out.print(a[row - 1][i] + " ");
                }
                row--;
            }

            // Print the first column from the remaining columns */
            if (l < column) {
                for (i = row - 1; i >= k; i--) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
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

        System.out.println("Enter Matrix Data");

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("Your Matrix:");

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();
        }

//        int row = matrix.length;

//        int column = matrix.length;


        spiralPrint(matrixRow,matrixCol,matrix);




    }


}
