import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //boy metre cinsinden kilo kg cinsinden olacak

        double indeks,boy,kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu giriniz (m): ");
        boy = input.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz (Kg): ");
        kilo = input.nextDouble();

        indeks = kilo/(boy*boy);

        System.out.println("Vücut kitle indeksiniz : "+indeks);
    }
}
