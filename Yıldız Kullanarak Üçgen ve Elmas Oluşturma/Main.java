import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        sayi = input.nextInt();

        for(int i=0;i<sayi;i++)
        {
            for(int j=0;j<sayi-i;j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k<=2*i+1; k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //Ustteki for döngüsüyle ücgen oluşturduk
        //Alttaki for döngüleriyle elmas olustrduk

        for(int i=sayi;i>=0;i--)
        {
            for(int j=sayi-i; j>0; j--)
            {
                System.out.print(" ");
            }
            for(int k=2*i+1;k>=1;k--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
