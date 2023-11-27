/*
    *Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM),
 yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
 İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

   * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
   *Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
   *Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
   *Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
   *Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe,yas,yolculukTipi;
        double km_basina_ucret = 0.10;
        double toplamTutar,yasIndirimi,indirimliTutar,gidisDonusIndirimi;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Gidilecek Mesafeyi Giriniz : ");
        mesafe = input.nextInt();
        System.out.print("Lutfen Yasinizi Giriniz : ");
        yas = input.nextInt();

        toplamTutar = mesafe*km_basina_ucret;

        if(yas<12)
        {
            System.out.print("Lutfen yolculuk Tipini Giriniz (1 => TEK YÖN VEYA 2 => GİDİŞ-DÖNÜŞ) : ");
            yolculukTipi = input.nextInt();
            if(yolculukTipi == 1)
            {
                yasIndirimi = toplamTutar*0.5;
                toplamTutar-=yasIndirimi;
                System.out.println("Bilet Fiyatınız : "+toplamTutar);            }
            else if(yolculukTipi == 2)
            {
                yasIndirimi = toplamTutar*0.5;
                indirimliTutar = toplamTutar-yasIndirimi;
                gidisDonusIndirimi = indirimliTutar*0.2;
                toplamTutar = (indirimliTutar - gidisDonusIndirimi)*2;
                System.out.println("Bilet Fiyatınız : "+toplamTutar);
            }
            else
            {
                System.out.println("Hatalı Giriş Yaptınız!!!");
            }
        }
        else if(yas>12 && yas<24)
        {
            System.out.print("Lutfen yolculuk Tipini Giriniz (1 => TEK YÖN VEYA 2 => GİDİŞ-DÖNÜŞ) : ");
            yolculukTipi = input.nextInt();
            if(yolculukTipi == 1)
            {
                yasIndirimi = toplamTutar*0.1;
                toplamTutar-=yasIndirimi;
                System.out.println("Bilet Fiyatınız : "+toplamTutar);
            }
            else if(yolculukTipi == 2)
            {
                yasIndirimi = toplamTutar*0.1;
                indirimliTutar = toplamTutar-yasIndirimi;
                gidisDonusIndirimi = indirimliTutar*0.2;
                toplamTutar = (indirimliTutar - gidisDonusIndirimi)*2;
                System.out.println("Bilet Fiyatınız : "+toplamTutar);
            }
            else
            {
                System.out.println("Hatalı Giriş Yaptınız!!!");
            }
        }
        else if(yas>65)
        {
            System.out.print("Lutfen yolculuk Tipini Giriniz (1 => TEK YÖN VEYA 2 => GİDİŞ-DÖNÜŞ) : ");
            yolculukTipi = input.nextInt();
            if(yolculukTipi == 1)
            {
                yasIndirimi = toplamTutar*0.3;
                toplamTutar-=yasIndirimi;
                System.out.println("Bilet Fiyatınız : "+toplamTutar);             }
            else if(yolculukTipi == 2)
            {
                yasIndirimi = toplamTutar*0.3;
                indirimliTutar = toplamTutar-yasIndirimi;
                gidisDonusIndirimi = indirimliTutar*0.2;
                toplamTutar = (indirimliTutar - gidisDonusIndirimi)*2;
                System.out.println("Bilet Fiyatınız : "+toplamTutar);           }
            else
            {
                System.out.println("Hatalı Giriş Yaptınız!!!");
            }
        }
        else
        {
            System.out.print("Lutfen yolculuk Tipini Giriniz (1 => TEK YÖN VEYA 2 => GİDİŞ-DÖNÜŞ) : ");
            yolculukTipi = input.nextInt();
            if(yolculukTipi == 1)
            {
                System.out.println("Bilet Fiyatınız : "+toplamTutar);
            }
            else if(yolculukTipi == 2)
            {
                toplamTutar=(toplamTutar-toplamTutar*0.2)*2;
                System.out.println("Bilet Fiyatınız : "+toplamTutar);
            }
            else
            {
                System.out.println("Hatalı Giriş Yaptınız!!!");
            }
        }
    }
}
