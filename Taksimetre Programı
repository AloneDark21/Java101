import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Mesafe KM olarak girilecektir
        //minimum ödeme tutarı 20 TL olacaktır

        double açılış_ucreti = 10;
        double km_ucreti = 2.20;
        double odeme_tutarı;
        int mesafe;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen mesafe (KM) :  ");
        mesafe = input.nextInt();

        odeme_tutarı = açılış_ucreti + mesafe * km_ucreti;
        odeme_tutarı = (odeme_tutarı < 20) ? 20 : odeme_tutarı;

        System.out.println("Odenecek tutar : "+ odeme_tutarı +"TL");
    }
}
