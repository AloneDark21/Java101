import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int iterNum;
        System.out.print("Serinin kaçıncı adımına kadar gideceksiniz : ");
        iterNum = input.nextInt();

        int a=0,b=1;
        System.out.print(a);
        System.out.print(" "+b);
        int sonraki = 0;
        for (int i = 0; i < iterNum-2; i++)
        {
            sonraki = a+b;
            System.out.print(" "+sonraki);
            a=b;
            b=sonraki;
        }
        a++;
        b++;
    }
}
