import java.util.*;
public class j5{
     public static void pal(int num2)
     {
        int ans=0;
        int num =num2;
        System.out.println(num);
        System.out.println(num2);
        while(num!=0)
        {
            int digit = num%10;
            ans= (ans*10)+ digit;
            num=num/10;
        }
        System.out.println(num);
        System.out.println(ans);
        if(ans==num2)
        {
            System.out.println("number is palindrome\n");
        }
        else{
            System.out.println("number is not palindrome\n");
        }
     }
    public static void main(String[] args) {
  
            int num=0;
            System.out.println("enter thenumber\n");
            Scanner sc =new Scanner(System.in);
            num= sc.nextInt();
            pal(num);
    }
}