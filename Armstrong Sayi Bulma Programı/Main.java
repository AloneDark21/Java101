import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi , temp , temp1;
        int k = 0;//k girilen sayinin basamak sayisi
        int toplam = 0;
        int kalan;
        int us = 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        sayi = scan.nextInt();
        temp = sayi;
        temp1 = sayi;

        while(temp != 0)
        {
            temp = temp/10;
            k++;//girilen sayinin basamak sayisini bulduk
        }
        while(sayi != 0)
        {
            kalan = sayi % 10;
            for(int i = 1; i<=k;i++)
            {
                us = us * kalan;//basamak sayılarının uslerini bulduk
            }
            toplam += us;//basamak sayılarının uslerinin toplamı
            us = 1;
            sayi = sayi/10;
        }
        if(toplam == temp1)//sayi değerimiz üzerinde işlem yaptığımız için değişiyor o yüzden sayi değerini değişmeyen temp1 değişkenine atadık
            System.out.println("Bu bir armstrong sayidir.");
        else
            System.out.println("Bu bir armstrong sayi değildir.");
    }
}
