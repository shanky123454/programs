import java.util.*;
import java.lang.*;
class exc{
    public static void main(String[] args)
    {
        try{
        System.out.println("enter the number to divide");
        int num1,num2=0;
        Scanner sc = new Scanner(System.in);
        num1= sc.nextInt();
        System.out.println("enter the second number to divide");
        num2=sc.nextInt();
         int a  =num1/num2;
         System.out.println("result after dividing numbers are" + a);
        }
        catch(ArithmeticException e)
        { 
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
       
    }
}

// try with resources
// try(BufferedReader br=new BufferedReader(new FileReader("abc.txt")){
//     //use br and perform the necessary operation
//     //once the control reaches the end of try automatically br will be closed
//     }catch(IOException ie){
//     //handling code

// Rules of using try with resource
// ================================
// 1. we can declare any no of resources, but all these resources should be seperated
// with ;
// eg#1.
// try(R1;R2;R3;){
// //use the resources
// }