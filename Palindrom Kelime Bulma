import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sorgulatmak Istediğiniz Kelimeyi Giriniz : ");
        str = scan.nextLine();

        if(!isPolindrome2(str))
        {
            System.out.println("Bu kelime palindrom değildir.");
        }
        else
        {
            System.out.println("Bu kelime palindromdur");
        }
    }

    // 1.yontem
    static boolean isPolindrome2(String str)
    {
        String str2 = "";
        for(int i = 0; i<str.length();i++)
        {
            str2 += str.charAt(i);
        }        
        System.out.println(str2);
        return str2.equals(str);
    }

    // 2.Yontem
    static boolean isPolindrome1(String str)
    {
        int i = 0;
        int j = str.length() -1;

        while(i < j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    
}
