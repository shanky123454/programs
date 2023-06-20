import java.util.*;
import java.lang.*;
class Display{
	public static synchronized void wish(String name) {
		for(int i=0; i<name.length(); i++)
		{
			System.out.println("good morning" + " " + name +" " +"have your breakfast");
			try {
			Thread.sleep(1000);
		       } catch(InterruptedException e)
			{
		    	   e.printStackTrace();
			}
	   }	
}

	public synchronized void wish1(String name1) {
		for(int i=0; i<name1.length(); i++)
		{
			System.out.println("good morning" + " " + name1 +" " +"have your breakfast");
			try {
			Thread.sleep(1000);
		       } catch(InterruptedException e)
			{
		    	   e.printStackTrace();
			}
	   }	
}
}
class MyThread1 extends Thread{
	Display d;
	String name;
	public MyThread1(Display d, String name)
	{
		this.d =d;
		this.name= name;
	}
	public void run()
	{
		d.wish(name);
	}
}
class MyThread2 extends Thread{
	Display d;
	String name1;
	public MyThread2(Display d, String name1)
	{
		this.d =d;
		this.name1= name1;
	}
	public void run()
	{
		d.wish1(name1);
	}
}
 class sha{
public static void main(String[] args) {
	Display d= new Display();
  MyThread1 t1= new MyThread1(d,"yuvi");
  MyThread2 t2= new MyThread2(d,"sachin");
  t1.start();
  t2.start();
}
}
