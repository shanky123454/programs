import java.util.*;
import java.lang.*;

// public interface Runnable{
//     void run();
// }
//  public class Thread implements Runnable
//  {
//           public void run()
//           {
//               //NO IMPLEMENTATION(CHILD CLASS OVERRIDE THE METHOD AND PROVIDE THE IMPLEMENTATION)
//           }
//        public void start()
//       {
//         // REGISTER THE THREAD WITH THREADSCHEDULER
//         //ALL THE MANDATORY LOW LEVEL ACTIVITIES
//         // INVOKE THE run() METHOD
//       }
//  }
class MyRunnable implements Runnable{
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
    }  
}
class m3{
    public static  void main (String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);// calls the start method of thread class but run method of MyRunnable class implementing Runnable interface
        t.start();
        for(int i=0 ;i < 5; i++)
        {
            System.out.println("main thread");
        }       
    }
}