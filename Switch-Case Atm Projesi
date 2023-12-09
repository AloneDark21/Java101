import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int money, select ;
        int balance  = 15000, right = 3;
        String userName, passWord;

        Scanner input = new Scanner(System.in);

        while (true)
        {
            System.out.print("\nLutfen Kullanıcı Adınızı Giriniz :  ");
            userName = input.nextLine();
            System.out.print("\nLutfen Şifrenizi Giriniz : ");
            passWord = input.nextLine();

            if(userName.equals("Kerem") && passWord.equals("Java123"))
            {
                while(true)
                {
                    System.out.print("\n1-Para Çekme" +
                            "\n2-Para Yatırma"+
                            "\n3-Bakiye Sorgulama"+
                            "\n4-Çıkış");
                    System.out.print("\nLutfen Yapacağınız İşlemi Seçiniz : ");
                    select = input.nextInt();

                    switch (select)
                    {
                        case 1:
                            System.out.print("Lutfen Çekmek İstediğiniz Tutarı Giriniz : ");
                            int price = input.nextInt();
                            if(price>balance)
                            {
                                System.out.println("Bakiyeniz Yetersizdir.");
                            }
                            else
                            {
                                balance -= price;
                            }
                            break;

                        case 2:
                            System.out.print("Lutfen Yatırmak İstediğiniz Tutarı Giriniz : ");
                            int price1 = input.nextInt();
                            balance += price1;
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : "+balance);
                            break;

                    }
                    if(select == 4)
                        break;
                }
                break;

            }
            else
            {
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Sifre . Tekrar Deneyiniz.");
                if(right==0)
                {
                    System.out.println("Hesabınız Bloke Olmuştur Lutfen Banka İle İletişime Geçiniz.");
                    break;
                }
                else
                {
                    System.out.println("Kalan Deneme Hakkınız : "+right);
                }
            }
        }
    }
}
