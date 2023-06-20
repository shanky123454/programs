import java.util.*;
import java.lang.*;

 class eee{
    public static void main(String[] args)
    {
        System.out.println("enter the string");
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        s=s.replace(" ", "");
        System.out.println("required string is :" + s);
        char[] c = s.toCharArray();
        int length = c.length;
        int count =1;
        int visited = 0;
        System.out.println("duplicates char are:");
        for(int i =0; i<length;i++)
        {
            count=1;
            for(int j=i+1; j<length;j++)
            {
                if(c[i]==c[j])
                {
                    count++;
                    c[j]='0';
                }
            }
           if(count>1 && c[i]!='0')
           {
            System.out.println( c[i] +  " " + "occurs" + " " + count+" " + "times");
           }
        }
    }
}