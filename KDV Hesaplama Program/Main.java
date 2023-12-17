 /*
   * Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
   * tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
       int Fiyat;
       double kdvliFiyat,kdvTutarı,kdvOranı;

       Scanner input = new Scanner(System.in);
       Fiyat = input.nextInt();
       System.out.println("Kdvsiz Fiyat : "+Fiyat);

       kdvOranı = (Fiyat < 1000) ? 0.18 : 0.08;

       kdvliFiyat = Fiyat + (kdvOranı * Fiyat);
       kdvTutarı = kdvliFiyat-Fiyat;

        System.out.println("Kdvli Fiyat : "+kdvliFiyat);
        System.out.println("Kdv Tutarı : "+kdvTutarı);
    }
}
