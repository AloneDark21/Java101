import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yıl;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        yıl = input.nextInt();

        if((yıl %4 == 0 && yıl % 100 != 0) || (yıl % 400  ==0))
        {
            System.out.println(+yıl+" Bir Artık Yıldır");
        }
        else
        {
            System.out.println(+yıl+" Bir Artık Yıl Değildir");
        }

    }
}
