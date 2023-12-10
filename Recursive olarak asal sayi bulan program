import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayıs giriniz : ");
        int sayi = scan.nextInt();

        if(asalMi(sayi,sayi/2))
            System.out.println(sayi+" Asal Sayidir.");
        else
            System.out.println(sayi+" Asal değildir.");
        
    }static boolean asalMi(int sayi, int bolen)
    {
        if(sayi == 1)
            return false;
        if(bolen  == 1)
            return true;
        else
        {
            if(sayi % bolen == 0)
                return false;
            else
                return asalMi(sayi,bolen-1);
        }
    }
}
