import java.util.*;
import java.lang.*;
class display11{
    public static void main(String[] args)
    {
        System.out.println("enter the string ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        s1 = s1.replace(" ", "");
        s1=s1.toUpperCase();
        char[] c1 = s1.toCharArray();
        int[] a = new int[26];
        int flag=0;
       // String s2= new String(ch);
        System.out.println("required string is:" + s1);
        //System.out.println("required string is:" + s2);
        //s2=s2.toUpperCase();
      // char[] c2 = s2.toCharArray();

       for(int i=0; i<c1.length;i++)
       {
            int index = c1[i]-65;
            a[index]++;
       }

       for(int i=0; i<a.length;i++)
       {
          if(a[i]==0)
          {
           // System.out.println("string is not panagram\n");
            flag=1;
          }
       }

       if(flag==1)
       {
        System.out.println("string is  not panagram\n");
       }
       else{
        System.out.println("string is panagram\n");
       }


    }
}