//Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        int[] arr = {4,58,-65,70,1,12,7,16};
        
        Scanner in = new Scanner(System.in);
        System.out.print("Sayi : ");
        int sayi = in.nextInt();
        int kucuk = -11111, buyuk = 11111;

        for (int i = 0; i<arr.length ; i++) 
        {
            if(arr[i] > sayi)
            {
                if((arr[i]-sayi) < buyuk)
                {
                    buyuk = arr[i];
                }
            }
            else
            {
                if((arr[i]-sayi) > kucuk)
                {
                    kucuk = arr[i];
                }
            }
        }
        System.out.println(sayi+" dan Büyük en Yakin Sayi : "+buyuk);
        System.out.println(sayi+" dan Kucuk En Yakin Sayi : "+kucuk);
    }
}
