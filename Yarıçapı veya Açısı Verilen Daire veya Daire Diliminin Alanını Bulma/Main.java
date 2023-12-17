import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * 1->yarı çapı verilen dairenin alanı : Pi*r^2
        * 2->merkez açısı verilen daire parçasının alanı : (pi*r^2*acı)/360
         */

        double pi = 3.14;
        double r;
        double acı;
        double alan1,alan2;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarı capı giriniz : ");
        r = input.nextDouble();
        alan1 = pi*Math.pow(r,2);

        System.out.print("Alanını bulmak istediğiniz daire parçasının acısını giriniz : ");
        acı = input.nextDouble();
        alan2 = (pi*Math.pow(r,2)*acı)/360;

        System.out.println("Yarıçapı verilen dairenin alanı : "+alan1);
        System.out.println("Açısı verilen daire parçasının alanı : "+alan2);

    }
}
