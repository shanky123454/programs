import java.util.*;
public class j1{
public static void moo(int num)
{
    boolean b = false;
    for (int i=2; i<num-1; i++)
    {
        if(num%i==0)
        {
            b=true;
            break;
        }
    }
  if(b==true)
  {
    System.out.println("number is not prime\n");
  }
   else{
    System.out.println("number is prime \n");
   }
}
public  static void main(String[] args) {
    System.out.println("enter the number\n");
    int number;
    Scanner sc = new Scanner(System.in);
    number =sc.nextInt();
    moo(number);    
}
}
