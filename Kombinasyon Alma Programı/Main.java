import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r;
        Scanner input = new Scanner(System.in);
        System.out.println("n ve r değerlerini giriniz : ");
        n = input.nextInt();
        r = input.nextInt();

        int kombinasyon = c_Hesabi(n,r);

        System.out.printf("C(%d,%d) : %d",n,r,kombinasyon);
    }
    public static int c_Hesabi(int n, int r)
    {
        if(n == 0 || n == r)
            return 1;
        else
        {
            int kombinasyon = 1;
            for (int i = 1; i <= r; i++) {
                kombinasyon = kombinasyon * (n - i + 1) / i;
            }
            return kombinasyon;
        }
    }
}
