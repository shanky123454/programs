import java.util.*;
import java.lang.*;
class MyThread extends Thread{
int total =0;
public void run(){
    synchronized(this){
        System.out.println("child thread is given chance");
for(int i=0; i<10;i++)
{
    total = total+i;
}
System.out.println("child thread is giving notification");
this.notify();
}
}
}
class vm1{
    public static void main (String[] args) throws InterruptedException
    {
        //Display d  = new Display();
        MyThread t = new MyThread();
        t.start();        
        //Thread.sleep(1000);//==> without both commented lines output will be ZERO
      // t.join();//==>> after both the lines then output will be the required output
      synchronized(t){
      System.out.println("main thread is waiting");
      t.wait();
      System.out.println("lock is given to main thread");
      System.out.println(t.total);
    }
        
    }
}