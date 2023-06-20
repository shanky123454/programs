import java.util.*;
import java.lang.*;
class exc1{
    public static void main(String[] args)
    {
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
        catch(NegativeArraySizeException e)
        {
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println("something is wrong in your logic");
        }
        finally{
            System.out.println("resouces are closed");
        }
       
    }
}