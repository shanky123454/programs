import java.util.*;
import java.lang.*;
    class Beta{
        public void walk() throws ArithmeticException
        {
            System.out.println("enter the first number to divide");
            Scanner sc = new Scanner(System.in);
            int num1= sc.nextInt();
            System.out.println("enter the second number to divide");
            int num2= sc. nextInt();
            try{
            int res= num1/num2;
            System.out.println("result after dividing numbers are:" + res);
            }
            catch(ArithmeticException e)
            {
                e.printStackTrace();
                throw e;
            }
        }
    }

    class Alpha{
        public void run() throws ArithmeticException
        {
            try{
            Beta b = new Beta();
            b.walk();
            }
            catch(ArithmeticException e)
            {
                e.printStackTrace();
                System.out.println("exception is handled in ALpha ");
                throw e;
            }
            // finally{
            //     System.out.println("exception is handled in alpha");
            // }
        }
    }
    class sexy{
    public static void main (String[] args)
    {
        try{
        System.out.println("connection is established");
        Alpha a = new Alpha();
        a.run();
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
            System.out.println("exception is handled in main");
        }
    }
}
