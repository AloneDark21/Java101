import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N,sayi;
        int enB = 0;
        int enK = 0;

        System.out.print("Kaç tane sayı gireceksiniz : ");
        N = input.nextInt();

        for(int i = 1; i <= N; i++)
        {
            System.out.printf("%d. sayiyi giriniz : ",i);
            sayi = input.nextInt();
            if(sayi>enB)
                enB = sayi;
            if(sayi<enK)
                enK = sayi;
        }
        System.out.println("En Buyuk Sayi : "+enB);
        System.out.println("En Kucuk Sayi : "+enK);
    }
}
