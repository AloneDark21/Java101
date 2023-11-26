import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName;
        String password;

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();
        System.out.print("Sifreniz : ");
        password = input.nextLine();

        if(userName.equals("Patika") && password.equals("Java.123"))
        {
            System.out.println("Başarili bir şekilde giriş yaptiniz.");
        }
        else
        {
            System.out.println("Bilgileriniz yanlis...");
            boolean bool = (password.equals("Java123")) ? true : false;

            if (bool == false)
            {
                System.out.print("Sifrenizi sıfırlamak istermisiniz ? (Evet/Hayır) :  ");
                String secim;
                secim = input.nextLine();
                String newPassword;

                    if(secim.equals("Evet"))
                    {
                        System.out.print("Lutfen yeni sifrenizi giriniz : ");
                        newPassword = input.nextLine();

                        if(newPassword.equals("Java123"))
                        {
                            System.out.println("Sifre olusturulamadı, lütfen farklı bir sifre giriniz!!!");
                        }
                        else
                        {
                            System.out.println("Sifreniz başarılı bir şekilde oluşturuldu.");
                        }
                    }
                    if(secim.equals("Hayır"))
                    {
                        System.out.println("Sistemden çıkılıyor...");
                    }
            }
        }
    }
}
