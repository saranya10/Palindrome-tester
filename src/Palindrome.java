import java.util.Scanner;

public class Palindrome {



    public static void main(String [] args)
    {
        String input;
        int length;
        String reverse="";
        int j = 0;
        System.out.println("Enter input to be checked: ");
        Scanner std = new Scanner(System.in);
        input = std.nextLine();
        char[] ch = input.toCharArray();
        length = input.length();
        char[] Strarray = new char[length];
        for(int i=length-1;i>=0;i--,j++)
        {

            Strarray[j] = ch[i] ;
            reverse = reverse + Strarray[j];

        }

        if (input.equals(reverse))
        {
            System.out.println("Input string is a palindrome");
        }
        else
        {
            System.out.println("NOT a palindrome!!!");
        }

    }
}
