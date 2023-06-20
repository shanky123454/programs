import java.util.*;
import java.lang.*;
class d{
    public static void fun(char[] c)
    {
        for(int i=0; i<c.length;i++)
        {
            if(c[i]>='a' && c[i]<='z' )
            {
                c[i]= (char)(c[i]-32);
            }
            else if(c[i] >='A' && c[i]<='Z')
            {
                c[i] = (char)(c[i] +32);
            }
            else{

            }
        } 
        Arrays.toString(c);
        System.out.println(c);
    }
    public static void main(String[] args)
    {
        System.out.println("enter the string ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("required string is:" + s);
        int length = s.length();
       // String s1= "";
      // s=s.replace(" ", "");
        char[] c= s.toCharArray();
       fun(c);



    }
}