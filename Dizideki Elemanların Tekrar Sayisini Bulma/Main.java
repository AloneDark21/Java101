import java.lang.System;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) 
    {
        int[] dizi = {1,13,13,10,1,2,3,4,5,2,5,10,4};
        int[] tekrarSayilari = new int[dizi.length];
        Arrays.fill(tekrarSayilari, -1);

        for (int i = 0; i < dizi.length; i++) 
        {
            int sayac = 1;
            for (int j = i + 1; j < dizi.length; j++) 
            {
                if (dizi[i] == dizi[j]) 
                {
                    sayac++;
                    tekrarSayilari[j] = 0;
                }
        
                if (tekrarSayilari[i] != 0) 
                {
                    tekrarSayilari[i] = sayac;
                }   
            }
        }
        for (int i = 0; i < dizi.length; i++) 
         {
             if (tekrarSayilari[i] != 0) 
            {
                System.out.println(dizi[i] + " sayısı " + tekrarSayilari[i] + " kez tekrar ediyor.");
            }
        }
    }    
}

