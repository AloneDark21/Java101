import java.util.Arrays;
import java.lang.System;

public class Main 
{
    public static void main(String[] args) {
        int[] arr = {3,6,1,9,1,7,6,3,8,8,10,15,12,10,12};
        int[] tempArr = new int[arr.length];
        int index = 0;

        for(int i = 0; i<arr.length; i++)
        {
            for(int j = i+1; j<arr.length; j++)
             {
                
                if((arr[i]%2 == 0) && ((i != j)  && (arr[i] == arr[j])))
                {
                    tempArr[index++] = arr[i];
                }   
                
             }
        }
        System.out.print("Tekrar eden sayilar : ");
        for (int i = 0; i<tempArr.length; i++) {
            if(tempArr[i] != 0)
                System.out.print(" "+tempArr[i]);
        }
       
    }   
}
