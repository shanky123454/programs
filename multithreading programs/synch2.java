import java.util.*;
import java.lang.*;
class Display{
public synchronized void wish(String name)// public synchronized void wish(String name) // => to make output regular
{
    String name1= name;
    for(int i=0;i<name1.length();i++)
    {
    System.out.println("good morning"+ " " + name1 );
    try{
    Thread.sleep(1000);
    }catch(InterruptedException e)
    {
        e.getStackTrace();
    }
    }
}
}

class MyThread extends Thread
{
    Display d;
    String name;
    public MyThread(Display d,String name)
    {
        this.d=d;
        this.name=name;    
    }
    public void run()
    {
        d.wish(name);
       
    }
}
class Ma{
    public static void main(String[]args)
    {
        Display d =new Display();
        MyThread t1 = new MyThread(d,"dhoni");
        MyThread t2= new MyThread(d, "sachin");
        t1.start();
        t2.start();
        System.out.println("end of main thread");
    }
}