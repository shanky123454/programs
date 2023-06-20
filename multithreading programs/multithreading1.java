import java.util.*;
import java.lang.*;

//  public class Thread
 // {
//           public void run()
//           {
//               NO IMPLEMENTATION(CHILD CLASS OVERRIDE THE METHOD AND PROVIDE THE IMPLEMENTATION)
//           }
//        public void start()
//       {
//         // REGISTER THE THREAD WITH THREADSCHEDULER
//         //ALL THE MANDATORY LOW LEVEL ACTIVITIES
//         // INVOKE THE run() METHOD
//       }
//  }
class MyThread extends Thread{

    public void start()
    {
        super.start();
        System.out.println("overrided start method is executed");
    }
    public void run()
    {
        int[] a = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int  i=0 ;i< 3 ;i++)
        {
            a[i] =sc.nextInt();
        }
        for (int i : a) {
            System.out.println(i);
        }
        run(5);
    }
    public void run(int i)
    {
        System.out.println(i);
    }
}
class m1{
    public static  void main (String[] args) {
        MyThread t = new MyThread();
        //Thread t1 =new Thread(t);// not recomended
      // t1.start();//not recomended
      t.start();
        for(int i=0 ;i < 5; i++)
        {
            System.out.println("main thread");
        }       
    }
}