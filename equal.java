import java.util.*;
import java.lang.*;

public class equal{
    public static void main(String[] args)
    {
        System.out.println("enter the string");
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("required string is :" + s);
        s=s.replace(" ", "");
        System.out.println("enter the number to which string be divided in N equal parts");
        int n = sc.nextInt();
        int length = s.length();
        String[] str = new String[n];
        int lol = length/n;
        int temp =0;
        if(length%n!=0)
        {
            System.out.println("string cannot be divided into n equal parts");
        }
        else{
            for(int i=0 ; i<length; i=i+lol)
            {
                String st= s.substring(i,i+lol);
                str[temp] = st;
                temp++;
            }

            for(int  i=0 ; i<str.length;i++)
            {
                System.out.println(str[i]);
            }

        }

    }
}