//for dögüsü kullanarak yazdık
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k,total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Ussu alinacak sayiyi giriniz : ");
        n = input.nextInt();
        System.out.print("Us sayisini giriniz : ");
        k = input.nextInt();

        for(int i = 1;i<=k; i++)
        {
            total*=n;
        }
        System.out.printf("%d^%d : %d",n,k,total);
    }
}
