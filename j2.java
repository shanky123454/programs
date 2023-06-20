import java.util.*;
public class j2{
public static void evenorodd(int num)
{
    if(num%2==0)
    {
    System.out.println("number is even\n");
        
    }
    else {
        System.out.print("number is not even\n");
    }
}
public static void main(String[] args)
    {
        int number=0;
        System.out.println("enter the number\n");
        Scanner sc = new Scanner(System.in);
         number = sc.nextInt();
         evenorodd(number);
    }
}