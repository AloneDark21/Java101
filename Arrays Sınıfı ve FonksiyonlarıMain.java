
import java.lang.System;
import java.util.Arrays;


public class Main 
{
    public static void main(String[] args) 
    {
        int[] arr1 = {35,48,-19,-140,36,75,16};
        /*
       * Arrays.toString() listeyi ekrana basamaya yarar
            System.out.println("\nListemiz : "+Arrays.toString(arr1));

       * Arrays.fill() metotu litemde istediğim yerlerdeki değeri değiştirmek için kullanılır
        ->1.kullanım şekli tüm değerleri 5 yapık
            Arrays.fill(arr1, 5);
            System.out.println("\nListemiz : "+Arrays.toString(arr1));
        ->2.Kullanım şekli girdiğimiz aralıktaki değerleri değiştirdik
            Arrays.fill(arr1, 1, 6, 3);
            System.out.println("\nListemiz : "+Arrays.toString(arr1));

         
       * Arrays.sort() dizimizi sıralama işlemini yapar
            Arrays.sort(arr1);
            System.out.println("\nListemiz : "+Arrays.toString(arr1));
        
       * Arrays.binarysearch() dizimizdeki değerin indis numarasını bulmaya yarar
            int index = Arrays.binarySearch(arr1, 36);
            System.out.println(index);
        
       * Arrays.copyOf() fonksiyonu bir dizideki değerlerin girilen indis numarasına kadar diğer diziye aktarılmasını sağlar
            int[] arr2 = Arrays.copyOf(arr1, 5);//arr1 deki ilk 5 elemanı arr2 dizisine kopyaladık
            System.out.println("\nListemiz : "+Arrays.toString(arr1));
            System.out.println("\nKopyaladiğimiz Listemiz : "+Arrays.toString(arr2));

       * Arrays.copyOfRange() fonksiyonu da belirlediğimiz aralıktaki değerleri kopyalar
            int[] arr3 = Arrays.copyOfRange(arr1, 2, 5);
            System.out.println("\nListemiz : "+Arrays.toString(arr1));//arr1 deki 2 ve 5 inidis numaraları arasındaki değerleri arr3 e akatrdı
            System.out.println("\nKopyaladiğimiz Listemiz : "+Arrays.toString(arr3));
       * Arrays.equals() iki diziyi karşılaştırır diziler eşitse true değilse false döndürür
            System.out.println(Arrays.equals(arr1,arr2));
        
        */
    }

}
