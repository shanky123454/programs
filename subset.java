import java.util.*;
import java.lang.*;
 public class subset{
    public static void main(String[] args)
     {
        System.out.println("enter the string ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("required string is:" + s);
        int length = s.length();
        int temp =0;
        String[] str = new String[length*(length+1)/2];
        for(int i=0;i<s.length();i++)
        {
            for(int j=i; j<s.length();j++)
            {
                str[temp]= s.substring(i,j+1);
                temp++;
            }
        }
        System.out.println("subset of the string are:");
        for(int  i=0; i< str.length;i++)
        {
            System.out.println(str[i]);
        }
    }
}