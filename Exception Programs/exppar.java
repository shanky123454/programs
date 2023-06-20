import java.util.*;
import java.lang.*;
class Hello{
 public synchronized void dispchar()
 {
    for(int  i=65; i<70; i++)
    {
        try{
        System.out.println((char)i);
        Thread.sleep(1000);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
 }
 public void dispnum()
    {
        for(int i=65;i<70;i++)
        {
            System.out.println(i);
        }
    }
 
}
class MyThread extends Thread{
    Hello h;
    public MyThread(Hello h)
    {
        this.h =h;
    }
    public void run()
    {
        h.dispchar();
    }
    public void wish()
    {
        h.dispnum();
    }
}
class po{
    public static void main (String[] args)
    {
        Hello h =new Hello();
        MyThread t1 = new MyThread(h);
        t1.start();
        t1.wish();
    }
}