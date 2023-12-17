import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        Random rand = new Random();//Random sınıfından bir rand nesnesi olşturduk
        int number = rand.nextInt(100);//0-100 Arasında olmasını istedik 
        
        Scanner scan = new Scanner(System.in);

        int selected;
        int right = 0;
        int[] wrong = new int[5];
        boolean isWrong = false;

        System.out.println(number);
        while(right < 5)
        {
            System.out.print("Lutfen tahmininizi girin : ");
            selected = scan.nextInt();

            if(selected < 0 || selected > 100){

                System.out.println("Lutfen 0-100 arasında bir değer giriniz.");

                if(isWrong)
                {
                     right++;
                     System.out.println("birden fazla hatali giriş yaptiniz kalan hakkiniz : " + (5-right));
                }
                else
                {
                    isWrong = true;
                    System.out.println("Hatalı giriş yaptınız tekrar hatalı giris yaapmaniz durumunda caninizdan dusurulucektir.");
                }
               
                continue;
            }
            else
            {
                if(selected == number)
                {
                    System.out.println("Tebrikler doğru tahmin kazandınız.");
                    wrong[right] = selected;
                    break;
                }
                else
                {
                    if(selected > number)
                    {
                        System.out.println("Tahmininiz doğru sayıdan büyüktür.");
                    }
                    else
                    {
                        System.out.println("Tahmininiz doğru sayidan küçüktür.");
                    }
                    System.out.println("Hatalı tahmin yaptınız.");
                    wrong[right] = selected;
                    right++;
                    System.out.println("Kalan hakkınız = "+(5-(right)));
                    if(right == 5)
                    {
                        System.out.println("Kaybettiniz");
                    }
                    
                }
            }
        }

        System.out.println("Tahminleriniz : ");

        for (int i : wrong) {
            if(i != 0)
            {
                System.out.print("  "+i);
            }
           
        }
    }
}
