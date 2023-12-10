import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n ;
        Scanner scan = new Scanner(System.in);
        System.out.println("N Sayısı : " );
        n = scan.nextInt();
        recursiveMethod(n);
    }

    public static void recursiveMethod(int value) {
        //Sayı 0 veya negatifse işlemi sonlandır.
        if (value <= 0) {
            System.out.print(value + " ");
            return;
        }

        // Her adımda 5 çıkar ve son değeri ekrana yazdır.
        System.out.print(value + " ");
        recursiveMethod(value - 5);

        // Sayı negatif veya 0 olduğunda, tekrar 5 ekleyip son değeri ekrana yazdır.
        System.out.print(value + " ");
    }
}
