import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu =       "1-Toplama Islemi\n" +
                            "2-Çıkarma İslemi\n" +
                            "3-Çarpma İslemi\n" +
                            "4-Bolme İslemi\n" +
                            "5-Üss Alma\n" +
                            "6-Faktöriyel Hesaplama\n" +
                            "7-Mod Alma\n" +
                            "8-Diktörtgen Alan ve Çevre Hesabı\n" +
                            "9-Cikis";
        do {
            System.out.println(menu);
            System.out.print("Yapacağınız İslemi Seciniz : ");
            select = input.nextInt();
            switch (select)
            {
                case 1:
                    toplama();
                    break;
                case 2:
                    cıkarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    ussAlma();
                    break;
                case 6:
                    faktoriyelHesabi();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    alanCevreHesabi();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Hatalı secim yaptınız lütfen yeniden secim yapınız!!!");
            }
        }while(select != 9);
    }
    static void toplama()
    {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }
    static void cıkarma()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç : " + result);
    }
    static void carpma()
    {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }
    static void bolme()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }
    static void ussAlma()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }
     static void faktoriyelHesabi()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    static void modAlma()
    {
        Scanner scan = new Scanner(System.in);
        int sayi1,sayi2,result = 0;
        System.out.println("Modu alınacak sayilari giriniz : ");
        System.out.print("Bolüm : ");
        sayi1 = scan.nextInt();
        System.out.print("Bölen : ");
        sayi2 = scan.nextInt();

        result = sayi1%sayi2;

        System.out.println("Kalan = "+result);
    }
    static void alanCevreHesabi()
    {
        Scanner scan = new Scanner(System.in);
        int yukseklik,uzunluk,alan,cevre;
        String select;

            System.out.println("Yükseklik ve Uzunluk degerlerini giriniz : ");
            yukseklik = scan.nextInt();
            uzunluk = scan.nextInt();

            scan.nextLine();
            System.out.print("Alan hesabımı mı yapacaksınız cevre hesabımı (alan/cevre): ");
            select = scan.nextLine();

            if(select.equals("alan"))
            {
                alan = yukseklik * uzunluk;
                System.out.println("Alan = "+alan);
            }
            if(select.equals("cevre"))
            {
                cevre = (yukseklik + uzunluk)*2;
                System.out.println("Cevre = "+cevre);
            }
    }
}
