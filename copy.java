import java.util.*;
import java.lang.*;

public class copy{
    public static void rev(String s1)
    {
       String s4= s1;
       // String s4= s1.replace(" ", "");
        int length = s4.length();
        String s3="";
        for(int i=s4.length()-1; i>=0; i--)
        {
            s3 = s3+s4.charAt(i);
        }
        System.out.println("string before reversing is"+ s4);
        System.out.println("string after reversing is"+ s3);
    }
    public static void rev1(String s1)
    {
        String s2= s1;
        int length = s2.length();
        String s3="";
        String[] str= s2.split(" ");
        for (String ele : str) {
            for(int i=ele.length()-1; i>=0; i--)
            {
                s3= s3+ele.charAt(i);
            }
            s3= s3+" ";
        }
        System.out.println("string before reversing"+s2);
        System.out.println("string after reversing" +s3);
    }
    public static void rev2(String s1)
    {
        String s2= s1;
        int length = s2.length();
        String s3="";
        String[] str= s2.split(" ");
        for (String ele : str) {
            for(int i=str.length-1; i>=0; i--)
            {
                s3= s3+str[i]+" ";
            }
           // s3= s3+" ";
        }
        System.out.println("string before reversing"+s2);
        System.out.println("string after reversing" +s3);
    }

    
    public static void main(String[] args)
    {
        System.out.println("enter the string ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2= "";
        for(int i=0 ;i<s1.length();i++)
        {
            s2=s2+ s1.charAt(i);
        }
        System.out.println("original string is "+ s1);
        System.out.println("string after copy is "+ s2);

        rev(s1);
        rev1(s1);
        rev2(s1);

    }
}