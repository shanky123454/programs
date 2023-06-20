import java.util.*;
import java.lang.*;
class MyThread extends Thread{
    public void run()
    {
        t2.join(500);

        for(int i=0; i<5;i++)
        {
            System.out.println("child thread");
        }
    }
}
class sagir{
    public static void main(String[] args) throws InterruptedException
    {
        Thread t2 = Thread.currentThread();
        MyThread t  = new MyThread();
        t.start();
        //t.join(1000,500);
        for(int i=0; i<5;i++)
        {
            System.out.println("main thread");
        }

    }
}