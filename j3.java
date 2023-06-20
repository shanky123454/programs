import java.util.*;
public class j3{
    public static void ap(int num, int a, int b)
    {
        int term =0;
        term = a+(num-1)*b;
       System.out.println("nth term is :" + term);
    }
 public static void main(String[] args) {
 int num=0;
 System.out.println("enter the nth term");
 Scanner sc = new Scanner(System.in);
 num = sc.nextInt();
 int a=1;
 int d=1;
 ap(num,a,d);
}
}