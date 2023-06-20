import java.util.*;
import java.lang.*;
class displa{
    public static void main(String[] args)
    {
        System.out.println("enter the string ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("required string is:" + s);
        int length = s.length();
        char[] c =new char[length];
        s.getChars(0, length, c, 0);
        for(int i=0 ; i<c.length;i++)
        {
            System.out.println(c[i]);
        }
    }
}