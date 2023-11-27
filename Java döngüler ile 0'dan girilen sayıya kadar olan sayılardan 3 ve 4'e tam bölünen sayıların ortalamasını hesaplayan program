import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        double ortalama = 0.0,toplam = 0.0;
        int k=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen bir sayi giriniz : ");
        sayi = input.nextInt();

        for(int i=0; i<sayi; i++)
        {
            if((i%3 == 0 ) && (i%4 == 0))
            {
                System.out.println(i);
                toplam+=i;
                k++;
            }
        }
        ortalama = toplam/k;
        System.out.println(ortalama);
    }
}
