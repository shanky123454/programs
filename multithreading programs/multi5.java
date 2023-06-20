import java.util.*;
import java.lang.*;
 class MyThread extends Thread
{
    public void run()
    {
       
    for(int i=1; i<5;i++)
    {
        System.out.println("child thread");
       // Thread.yield();
    }
    }
}
class fakru{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getPriority());
        //Thread.currentThread().setPriority(7);
        MyThread t = new MyThread();
       // t.setPriority(10);
        t.start();
        System.out.println(t.getPriority());
        for(int  i=0 ; i<5;i++)
        {
            Thread.yield();
            System.out.println("main thread");
        }



    }
}

