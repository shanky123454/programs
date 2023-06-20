import java.util.*;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.*;
class hi extends exc4{
    public static void hello() throws EOFException // if child class method throws checked exception then parent class method should also throws same checked exception or parent class of that checked Exception
    {
        System.out.println("shashank raj");
    }
}
class exc4{
    public static void main(String[] args) throws IOException{
        System.out.println("appliaction is started");
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("enter the number to divide");
        int num1,num2=0;
        num1= sc.nextInt();
        System.out.println("enter the second number to divide");
        num2=sc.nextInt();
         int a  =num1/num2;
         System.out.println("result after dividing numbers are" + a);
        }
        catch(ArithmeticException e)
        { 
            // System.out.println(e.getMessage());
            // System.out.println(e.toString());
            e.printStackTrace();
        }
        hi h = new hi();
        h.hello();

        try{
         System.out.println("enetr the size of the array");
         int size=sc.nextInt();
         int[] ar = new int[size];
         for(int i=0 ;i<size;i++)
         {
            ar[i]= sc.nextInt();
         }
         System.out.println("elements of array are:");
         {
            for (int i : ar) {
                System.out.println(i);
            }
         }
        
         System.out.println("enter the element to be inserted ");
         int ele = sc.nextInt();
         System.out.println("enter the position to which element to be inserted");
         int pos = sc.nextInt();
         ar[pos]= ele;
         System.out.println(ele + " is inserted successfully at index" + pos);
         for (int ii : ar) {
            System.out.println(ii);
         }
        }
        // catch(NegativeArraySizeException  | Exception e)// error bcz there should not be any relation b/w exception types
        // {
        //     e.printStackTrace();
        // }
        // catch(ArrayIndexOutOfBoundsException e)
        // {
        //     e.printStackTrace();
        // }
        catch(Exception e)
        {
            System.out.println("something is wrong in your logic");
        }
        finally{
            System.out.println("resouces are closed");
        }
       
    }
}