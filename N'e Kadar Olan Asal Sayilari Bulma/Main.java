import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaca kadar olan asal sayilari bulacaksiniz : ");
        int sayi = input.nextInt();
        
        boolean bolunuyorMu;

       for(int i = 2;i <= sayi; i++)
       {
           bolunuyorMu = false;
           for(int j = 2; j < i; j++)
           {
               if(i % j == 0)
               {
                   bolunuyorMu = true;
                   break;
               }
           }
           if(bolunuyorMu == false)
               System.out.println(i);
       }
    }
}
