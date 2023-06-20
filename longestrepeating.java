import java.util.*;
import java.lang.*;
import java.math.*;
 class subset1{
    public static String lcp(String s, String t)
    {
        int  n = Math.min(s.length(), t.length());
            for(int  i=0; i<n; i++)
            {
                if(s.charAt(i)!= t.charAt(i))
                {
                    return s.substring(0, i);
                }
            }
            return s.substring(0, n);
    }
    public static void main(String[] args)
     {
        System.out.println("enter the string ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("required string is:" + s);
        int length = s.length();
        String str ="";
        for(int  i=0 ;i<length;i++)
        {
            for(int j=i+1; j< length;j++)
            {
                 String x = lcp(s.substring(i,length),s.substring(j,length));
             if(str.length() < x.length())
            {
                str = x;
            }
           }
        }   
        System.out.println("lonest substring is:" + str);
     }
    }
