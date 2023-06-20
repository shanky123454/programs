import java.util.*;
import java.lang.*;
class MyThread extends Thread{
    public static Thread mt;
    @Override
    public void run(){
    try{
    mt.join();
    }
    catch (InterruptedException e){
    }
    
    for (int i=1;i<=10 ;i++ ){
    System.out.println("child thread");
    }
    
    }
    }
    public class thread {
    public static void main(String... args)throws InterruptedException{
    MyThread t=new MyThread();
    MyThread.mt=Thread.currentThread();
    t.join();
    t.start();
    for (int i=1;i<=10;i++ ){
    System.out.println("main thread");
    Thread.sleep(2000);//20sec sleep
    }
    }
    }