import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int turkce,mat,fizik,kimya,biyoloji;

        double ort;

        Scanner input = new Scanner(System.in);

        System.out.println("*****Lutfen notlarınızı Giriniz*****");

        System.out.print("Turkce : ");
        turkce = input.nextInt();
        System.out.print("Matematik : ");
        mat = input.nextInt();
        System.out.print("Fizik : ");
        fizik = input.nextInt();
        System.out.print("Kimya : ");
        kimya = input.nextInt();
        System.out.print("Biyoloji : ");
        biyoloji = input.nextInt();

        //notların 0 ve 100 arsında olduğunu kontrol ettikten sonra if bloğuna gireriz
        if(notLarGecerlimi(turkce) && notLarGecerlimi(mat) && notLarGecerlimi(fizik) && notLarGecerlimi(kimya) && notLarGecerlimi(biyoloji))
        {
            ort = (mat+turkce+fizik+kimya+biyoloji)/5;
            System.out.println("Ortalamnız : " +ort);
            if(ort>=55)
                System.out.println("Tebrikler gectiniz.");
            else
                System.out.println("Maalesef kaldınız.");
        }
        else
        {
            System.out.println("Notlar 0 ile 100 arssında olmalıdır.");
        }
    }
    public static boolean notLarGecerlimi(int not)
    {
        return not>=0 && not<=100;
    }
}
