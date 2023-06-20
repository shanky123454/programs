import java.util.*;
import java.lang.*;

 class eee1{
    public static void main(String[] args)
    {
        System.out.println("enter the string");
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("required string is" + s);
        String[] str = s.split(" ");
        int count =1;
        int visited= 0;
        String s2 = String.valueOf(visited);
        for(int i=0 ;i<str.length;i++)
        {
             count =1;
            for(int j=i+1; j<str.length;j++)
            {
                if(str[i].equals(str[j]))
                {
                    count++;
                    str[j]= s2;
                }
            }
            if(count>1 && str[i]!=s2)
            {
                System.out.println( str[i] +  " " + "occurs" + " " + count+" " + "times");
            }
        }
    }
}
