import java.util.*;
import java.lang.*;

 class equa{
    public static void main(String[] args)
    {
        System.out.println("enter the string");
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("required string is :" + s);
        s=s.replaceAll(" ", "&");
        System.out.println("string after removing whitespaces:" + s);


    }
}