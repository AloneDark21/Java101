public class Main {
    public static void main(String[] args) {
        isPolindrome(4);
    }
    static boolean isPolindrome(int number)
    {
        int temp = number;
        int lastNumber = 0, reverseNumber = 0;

        while (temp != 0)
        {
            System.out.println("=================");
            System.out.println("Sayi => "+temp);

            lastNumber = temp%10;
            System.out.println("Son Basamak = "+lastNumber);

            reverseNumber = (reverseNumber * 10)+lastNumber;
            System.out.println("Yeni Sayi = "+reverseNumber);

            temp /= 10;
            System.out.println("Yeni Temp = "+temp);
        }
        if(reverseNumber == number)
            System.out.println("Bu sayı polindromdur.");
        else
            System.out.println("Bu sayı polindrom değildir.");

        return true;
    }
}
