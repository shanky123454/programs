import java.util.*;
import java.lang.*;

class MyThread extends Thread{

    public void start()
    {
        super.start();
        System.out.println("overrided start method is executed");
    }
    public void run()
    {
        int[] a = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int  i=0 ;i< 3 ;i++)
        {
            a[i] =sc.nextInt();
        }
        for (int i : a) {
            System.out.println(i);
        }
        run(5);
    }
    public void run(int i)
    {
        System.out.println(i);
    }
}
class m4{
    public static  void main (String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("main thread");
        System.out.println(Thread.currentThread().getName());
        MyThread t = new MyThread();
        t.start();
        System.out.println(t.getName());
        t.setName("first thread");
        System.out.println(t.getName());
        for(int i=0 ;i < 5; i++)
        {
            System.out.println("main thread");
        }       
    }
}