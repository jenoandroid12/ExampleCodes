package com.example.example.ArrayMatrix;

import java.util.Scanner;

public class SortMatrixReverseRow {

    static void sortMat(int mat[][], int n) {



        for (int r1 = 0; r1 < n; r1++) {
            for (int c1 = 0; c1 < n; c1++) {
                for (int r = 0; r < n; r++) {
                    for (int c = 0; c < n; c++) {
                        if (mat[c1][r1] > mat[r][c]) {
                            int tmp = mat[c1][r1];
                            mat[c1][r1] = mat[r][c];
                            mat[r][c] = tmp;

                        }
                    }

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
        for (int u = 0; u < n; u++) {
            for (int j = 0; j < n; j++) {
                sortCol[u][j] = matrix[j][u];
                System.out.print(matrix[u][j] + " ");
            }
            System.out.println();
        }

        for (int u = 0; u < n; u++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sortCol[u][j] + " ");
            }
            System.out.println();
        }


    }

}

