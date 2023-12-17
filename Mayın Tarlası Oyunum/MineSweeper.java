import java.util.*;
import java.lang.*;

public class MineSweeper {
    int cols, rows, mayınSayisi;//cols colon sutun inidisi rows satrı indisini belirtir
    String[][] oyunTahatsi;
    String[][] mayinlarinKonumu;
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.oyunTahatsi = new String[rows][cols];
        this.mayinlarinKonumu = new String[rows][cols];
        this.mayınSayisi = ((rows * cols) / 4); //mayın sayımız eleman sayısının  4 te 1 i dir
    }

    public void run() {//oyuna baslama metodumuz
        oyunTahtasiHazirlama();//fonksiyonu cagırdık acıklama asagıda
        mayinlariYerlestir();//fonksiyonu cagırdık acıklama asagıda

        //System.out.println("\n**********Mayınların Konumu**********\n");
        printArr(mayinlarinKonumu);//dilerseniz mayınların konumlarını bu fonksiyonu cagırarak gorebilirsiniz

        int satir, sutun;//bunlar bizim gecici parametrelerimiz oyun boyunca bunlarla islemlerimizi yapacagız
        System.out.println("\n---> Oyun Basladi <---\n");

        int mayinsayisi = 0;
        while (true) {//mayına basana kadar sonsuz dongude oyunumuzu oynacagız

            printArr(oyunTahatsi);

            System.out.print("\nSatır Giriniz : ");
            satir = input.nextInt();
            System.out.print("Sutun Giriniz : ");
            sutun = input.nextInt();

            if (satir >= 0 && sutun >= 0 && satir <= rows && sutun <= cols) {
                if (oyunTahatsi[satir][sutun] == " -") {//eger oyun tahtasında acılmıs bir konum secerseniz diger adıma gecersiniz
                    continue;
                }
                if (!mayinlarinKonumu[satir][sutun].equals(" *")) {
                    mayinsayisi = mayınlarıKontrolEt(satir, sutun);
                    oyunTahatsi[satir][sutun] = " " + mayinsayisi + String.valueOf("");//String.valueOf fonksiyonu ile string ve integer bir degeri toplayıp string diziye yazdık

                } else if (mayinlarinKonumu[satir][sutun].equals(" *")) {//mayına basarsanız kaybedersiniz ve donguden cıkarsınız
                    System.out.println("\nKaybettiniz !!!");
                    printArr(mayinlarinKonumu);
                    break;

                }
                if (this.mayınSayisi == kazandiMi()) {// tüm mayınları bulursanız kazanırsınız
                    System.out.println("Tebrikler Hiçbir Mayına Basmadan Oyunu Tamamladınız !!!");
                    printArr(oyunTahatsi);
                    break;
                }

            } else {//oyun kurallarının dısında bir giris yaparsanın tekrar giris yapmaya yonlendirileceksiniz.
                System.out.println("Hatalı satır veya sutun secimi yaptınız lutfen tekrar giris yapınız.");
                continue;
            }
        }
    }

    public int kazandiMi() {//burda tüm mayınların açılıp açılmadığı kontrol edilir
        int acilanHucreSayisi = 0;

        for (int i = 0; i < oyunTahatsi.length; i++) {
            for (int j = 0; j < oyunTahatsi[0].length; j++) {
                if (oyunTahatsi[i][j] == " X") {
                    acilanHucreSayisi++;
                }
            }

        }
        return acilanHucreSayisi;
    }

    public void mayinlariYerlestir() //mayınları * olacak sekilde yerlestirdik
    {
        int satir, sutun, count = 0;

        while (count != mayınSayisi) {
            satir = rand.nextInt(rows);
            sutun = rand.nextInt(cols);

            if (mayinlarinKonumu[satir][sutun] != " *") {
                mayinlarinKonumu[satir][sutun] = " *";
                count++;
            }
        }
    }

    public void printArr(String[][] arr)//gonderilen diziyi ekrana yazan fonksiyon kendime göre bi dizayn yazptım calıstırıp görebilirsiniz
    {
        System.out.print("      ");
        for (int colNumber = 0; colNumber < arr.length; colNumber++) {
            if (colNumber > 10) {
                System.out.print(" " + colNumber);
            } else
                System.out.print("  " + colNumber);
        }
        System.out.println();
        System.out.print("      ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  -");
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i >= 10)
                System.out.print(i + "- [ ");
            else
                System.out.print(i + " - [ ");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println(" ] ");
            System.out.println();
        }
    }

    public void oyunTahtasiHazirlama()//her iki oyun tahtasınıda hazırladık
    {
        for (int i = 0; i < oyunTahatsi.length; i++) {
            for (int j = 0; j < oyunTahatsi[0].length; j++) {
                oyunTahatsi[i][j] = " X";
                mayinlarinKonumu[i][j] = " X";
            }
        }
    }

    public int mayınlarıKontrolEt(int satir, int sutun) {//burdada açtığımız kutucuga temas eden diger kutuları acıp temas eden mayın sayısını actıımız kutuya yazdırırız
        int count = 0;
        int tempRow, tempCol;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                tempRow = satir + i;
                tempCol = sutun + j;

                if (tempCol >= 0 && tempRow >= 0 && tempRow < rows && tempCol < cols) {
                    if (mayinlarinKonumu[tempRow][tempCol] == " *") {
                        count++;
                    }
                    if (mayinlarinKonumu[tempRow][tempCol] != " *" && oyunTahatsi[tempRow][tempCol] != " -") {
                        String eleman = oyunTahatsi[tempRow][tempCol];
                        try {
                            Integer.parseInt(eleman);

                        } catch (NumberFormatException e) {
                            oyunTahatsi[tempRow][tempCol] = " -";
                        }
                    }
                }
            }
        }
        return count;
    }
}
