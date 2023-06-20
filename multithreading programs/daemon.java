import java.util.*;
import java.lang.*;
class MyThread extends Thread{
    public void run()
    { 
        for(int i=0 ;i< 5; i++)
        {
            System.out.println("child thread");
        }
    }
}
class d{
    public static void main(String[] args) throws IllegalThreadStateException
    {
        System.out.println(Thread.currentThread().isDaemon());
       //Thread.currentThread().setDaemon(true);
        MyThread t = new MyThread();
        t.setDaemon(true);
        t.start();
        System.out.println("end of main thread");

    }
}