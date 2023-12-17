import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi,toplam  = 0;

        System.out.print("Lutfen bir sayi giriniz : ");
        sayi = input.nextInt();

        for(int i = 1; i <= sayi/2; i++)
        {
            if(sayi%i == 0)
                toplam+=i;
        }
        if(sayi == toplam)
            System.out.printf("%d mukemmel sayıdır.",sayi);
        else
            System.out.printf("%d mukemmel sayı degildir.",sayi);
    }
}
