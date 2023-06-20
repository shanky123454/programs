import java.util.*;
import java.lang.*;
class Display{
    public void wish(String name)
    {
        synchronized(this)
        {
            for(int i=0; i<name.length();i++)
            {
                System.out.println("good morning" + name);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
class MyThread extends Thread{
    Display d;
    String name;
    public MyThread(Display d, String name)
    {
        this.d =d;
        this.name=name;
    }
    public void run()
    {
        d.wish(name);
    }
}
class hug{
    public static void main(String[] args)
    {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "shanky");
        MyThread t2 = new MyThread(d, "ritu");
        t1.start();
        t2.start();
    }
}