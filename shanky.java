import java.util.*;
import java.lang.*;

class s{
    public static void fun(String s1 , int length)
    {
        s1=s1.toLowerCase();
        char[] c = s1.toCharArray();
        int vcount=0;
        int ccount=0;
        for(int i=0; i<length;i++)
        {
            if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u')
            {
                vcount++;
            }
            else if(c[i]>='a' && c[i]<='z')
            {
                ccount++;
            }
            else{

                }

        }
            System.out.println("total count of vowel is" + vcount);
            System.out.println("total count of consonant is" + ccount);
    }
    public static void main (String[] args)
    {
        System.out.println("enter the string ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println("STRING IS:" + s1);
        int length = s1.length();
        fun(s1,length);
    }
}