import java.util.*;
import java.lang.*;
class MyThread extends Thread{
int total =0;
public void run(){
for(int i=0; i<10;i++)
{
    total = total+i;
}
}
}
class vm{
    public static void main (String[] args) throws InterruptedException
    {
        //Display d  = new Display();
        MyThread t = new MyThread();
        t.start();
       // Thread.sleep(1000);//==> without both commented lines output will be ZERO
      // t.join();
        System.out.println(t.total);
    }
}