// class Test<T extends X>
// {}
// If x is a class then as the type parameter we can pass either x or its child
// classes.
// If x is an interface then as the type parameter we can pass either x or its
// implementation classes.

import java.util.*;
import java.lang.*;
class sdm<T extends Number,Runnable>// class type  bounded parameter
{
   // no compilation error because first it is extending and then implementing
   public void play()
   {
    System.out.println("shanky is playing");
   }

}

class sdm2<T extends Runnable,Number>
{
// no compilation error successfully executing
       
       public void help()
       {
        System.out.println("shanky is helping");
       }
}

class Main22
{
    public static void main(String[] args)
    {
        sdm<Integer,Thread> sdm1 = new sdm<Integer,Thread>();
        sdm<Float,Thread> sdm2 = new sdm<Float,Thread>();
        sdm1.play();

        sdm2<Thread,Integer> sdm = new sdm2<Thread,Integer>();
        sdm2<Thread,Integer> sd = new sdm2<Thread,Integer>();
        sdm.help();
        //sdm<String> t2 = new sdm<String>(); //CE

    
    }
}

// class Test <T extends Runnable>{}
// class Demo{
// public static void main(String[] args){
// Test<Thread> t1 = new Test<Thread>();
// Test<String> t2 = new Test<String>(); //CE
// }
// }


// Keypoints about  class bounded types 
// ------------------------------------------
// => We can't define bounded types by using implements and super keyword.
// => But implements keyword purpose we can replace with extends keyword.

// eg: class Test<T implements Runnable>{}//invalid
// class Test<T super String>{}//invalid