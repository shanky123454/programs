import java.util.*;
import java.lang.*;
class MyThread extends Thread {
    static Thread t2;
    public void run() 
    {
        try{
           t2.join();
        } catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        for(int i=0; i<5;i++)
        {
            System.out.println("child thread");
            try{
            Thread.sleep(1000);
               }
               catch(InterruptedException e)
               {
                e.printStackTrace();
               }  
        }
   }
}
class Main{
    public static void main(String[] args) throws InterruptedException
    {
        MyThread.t2 = Thread.currentThread();
        MyThread t  = new MyThread();
        t.start();
        //t.join();
        t.interrupt();
        for(int i=0; i<5;i++)
        {
            System.out.println("main thread");
            Thread.sleep(1000);
        }

    }
}