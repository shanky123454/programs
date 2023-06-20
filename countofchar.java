import java.util.*;

import javax.swing.event.SwingPropertyChangeSupport;

import java.lang.*;
class display16{
    public static void main(String[] args)
    {
        System.out.println("enter the string ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println("STRING IS:" + s1);
        s1=s1.replace(" ", "");
        int length = s1.length();
        System.out.println("no of character in the string is" + " " + length);
    }
}
