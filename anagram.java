import java.util.*;
import java.lang.*;
class display1{
    public static void main(String[] args)
    {
        System.out.println("enter the string ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2= sc.nextLine();
        System.out.println("required string is:" + s1);
        System.out.println("required string is:" + s2);

        s1=s1.toUpperCase();
        s2=s2.toUpperCase();

       char[] c1 = s1.toCharArray();
       char[] c2 = s2.toCharArray();

     Arrays.sort(c1);
     Arrays.sort(c2);

      if(Arrays.equals(c1,c2))
      {
        System.out.println("yes");
      }
      else
      {
        System.out.println("no");
      }
      sc.close();

    }
}