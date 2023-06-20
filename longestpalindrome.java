import java.util.*;
import java.lang.*;
public class longestpalindrome{   
    public static void paad(String[] str , int leng)
    {
        String[] aa = new String[leng];
        int temp =0;
        for(int i=0; i<leng;i++)
        {
             String st ="";
            for(int j=str[i].length()-1; j>=0; j--)
            {
                st= st+str[i].charAt(j);
            }
            if(str[i].equals(st))
            {
                System.out.println("string is palindrome" + str[i]);
                aa[temp]=st;
                temp++;
            }
        }
       String[] a= new String[temp];
        for(int o=0;o<a.length;o++)
        {
            a[o]=aa[o];
        }
        String small= a[0];
        for(int  j=0; j<a.length;j++)
        {
            if(a[j].length() < small.length())
            {
                small =a[j];
            }
        }
        System.out.println("smallest palindrome is:" + small);
        String gretaer =a[0];
        for(int k=0 ;k<a.length;k++)
        {
            if(a[k].length() > gretaer.length())
            {
                gretaer =a[k];
            }
        }
        System.out.println("greatest palindrome is:" + gretaer);

    }
    
    public static void main(String[] args)
    {
        System.out.println("enter the string ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println("required string is:" + s1);
        String[] str= s1.split(" ");
        for(int i=0 ;i<str.length;i++)
        {
            System.out.println(str[i]);
        } 
        int len = str.length;
        System.out.println("length of string is" + len);
        paad(str,len);
    }
}