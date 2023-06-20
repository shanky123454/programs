import java.util.*;
import java.lang.*;
class A{
public synchronized void d1(B b)
{
        System.out.println("inside class A ");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        b.last();
}
        public synchronized void last()
        {
            System.out.println("inside class A last method");
        }
}

class B{
    public synchronized void d2(A a)
    {
        System.out.println("inside class B ");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        a.last();
    }
        public synchronized void last()
        {
            System.out.println("inside class B last method");
        }   
}
class MyThread extends Thread{
    A a = new A();
    B b = new B();
    public void run()
    {
        a.d1(b);
    }
    public void m1()
    {
        b.d2(a);
    }
}
class dead{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        t.start();
        t.m1();
    }
}