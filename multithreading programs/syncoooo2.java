import java.util.*;
import java.lang.*;
class Display{
    public void wish(String name)
    {
        synchronized(Display.class)
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
class hug2{
    public static void main(String[] args)
    {
        Display d1 = new Display();
        Display d2 =new Display();
        MyThread t1 = new MyThread(d1, "shanky");
        MyThread t2 = new MyThread(d2, "ritu");
        t1.start();
        t2.start();
    }
}