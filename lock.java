import java.util.*;
import java.lang.*;
class display{
    public static void main(String[] args)
    {
        System.out.println("enter the string ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("required string is:" + s);
        int length = s.length();
        String s1= "";
        for(int i=length-1; i>=0;i--)
        {
            s1= s1 + s.charAt(i);

        }

        if(s.equals(s1))
        {
            System.out.println("string is palindrome\n");
        }
        else{
            System.out.println("string is not palindrome\n");
        }
    }
}