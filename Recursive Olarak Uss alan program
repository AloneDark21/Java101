import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Uss sayısını giriniz : ");
        int uss = scan.nextInt();
        System.out.print("Ussu Alınacak Sayiyi Giriniz : ");
        int sayi = scan.nextInt();

        int result = ussAlma(uss,sayi);

        System.out.printf("%d ^ %d = %d",sayi,uss,result);
    }
    static int ussAlma(int uss,int sayi)
    {
        if(uss == 0)
            return 1;
        else if(uss == 1)
            return sayi;
        else
            return sayi * ussAlma(uss-1,sayi);
    }
}
