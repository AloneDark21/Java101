//switc-case kullanarak hesap makinesi yapımı
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**********Hesap Makinesi Programına Hoşgeldiniz**********");

        double s1,s2;
        int secim;

        Scanner input = new Scanner(System.in);

        while(true)
        {
            System.out.println("1-Toplama Islemi");
            System.out.println("2-Çıkarma Islemi");
            System.out.println("3-Çarpma Islemi");
            System.out.println("4-Bölme Islemi");
            System.out.println("5-Cikis");

            System.out.print("Yapacaginiz Islemi Seciniz : ");
            secim = input.nextInt();
            if(secim == 5)
                break;

            System.out.print("İlk Sayıyı Giriniz : ");
            s1 = input.nextDouble();
            System.out.print("İkinci Sayıyı Giriniz : ");
            s2 = input.nextDouble();

            switch (secim)
            {
                case 1:
                    System.out.printf("%.2f + %.2f = %.2f\n",s1,s2,s1+s2);
                    break;
                case 2:
                    System.out.printf("%.2f - %.2f = %.2f\n",s1,s2,s1-s2);
                    break;
                case 3:
                    System.out.printf("%.2f * %.2f = %.2f\n",s1,s2,s1*s2);
                    break;
                case 4:
                    System.out.printf("%.2f / %.2f = %.2f\n",s1,s2,s1/s2);
                    break;
            }

        }
    }
}
