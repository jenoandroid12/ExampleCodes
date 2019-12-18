package com.example.example.ArrayMatrix;

public class Sample {

    static int sortRowWise(int[][] m, int c, int r, int rc)
    {
        int row = 0;
        int col = 0;
        int sortCol[][] = new int[10][20];
        // loop for rows of matrix
        for (int i = 0; i < rc; i++) {
            int val = 0;
            int row2 = row;
            int col2=0;

            if(((col+1) %c) == 0){
                row2++;
                col2=0;
            }
            else{
                col2 = col+1;
            }


            while(val<(rc-(i+1))){


                if(m[row][col]>m[row2][col2]){
                    int temp = m[row][col];
                    m[row][col]=m[row2][col2];
                    m[row2][col2]=temp;
                }




                col2++;
                if(((col2) %c) == 0){
                    row2++;
                    col2=0;
                }

                val++;
            }

//            sortCol[col][row] = m[row][col];

            col++;

            if(((i+1) %c) == 0){
                row++;
                col=0;
            }
        }

        // printing the sorted matrix
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sortCol[i][j] = m[j][i];
                System.out.print(m[i][j] + " "); }
            System.out.println();
        }

        System.out.println();

        // printing the sorted matrix
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(sortCol[i][j] + " "); }
            System.out.println();
        }


        return 0;
    }

    // driver code
    public static void main(String args[])
    {
        int m[][] = { { 8, 6, 5 ,56},
                { 1, 65,9, 7 },
                { 3, 73,4, 2 },{ 13, 43,40, 20 }};

        int c = 4;
        int r = 4;
        int rc = r*c;

        sortRowWise(m,c,r,rc);
    }
}
