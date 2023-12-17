import java.lang.System;

public class Main {
    public static void main(String[] args) 
    {

        int[][] arr = 
        {
            {4,3,2},
            {5,1,7}
        };
        int rows = arr.length;
        int cols = arr[0].length;

        int[][] transpozeArr = new int[cols][rows];

        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                transpozeArr[j][i] = arr[i][j];
            }
        }

        System.out.println("\nTranspoz Matris:");

        for (int i = 0; i < transpozeArr.length; i++) {
            for (int j = 0; j < transpozeArr[i].length; j++) {
                System.out.print(transpozeArr[i][j] + " ");
            }
            System.out.println();
        }         
    }
}
