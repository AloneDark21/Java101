import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        //Formul
        //u = (a+b+c)/2
        //u = u*(u-a)*(u-b)*(u-c)
        double a, b, c, u,alan;
        Scanner input = new Scanner(System.in);

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        u = (a+b+c)/2;
        alan = u*(u-a)*(u-b)*(u-c);
        System.out.println(Math.sqrt(alan));
    }
}
