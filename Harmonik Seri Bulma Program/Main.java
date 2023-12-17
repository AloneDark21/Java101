import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        double toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        sayi = input.nextInt();

        for(int i = 1 ; i <= sayi ; i++)
        {
            toplam += (1.0/i);//double bir değere atama yapmışsak işlem yaptığımız değerlerden en az bir tanesi double olması gerekir
        }
        System.out.println(toplam);
    }
}
