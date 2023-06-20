import java.util.*;
import java.lang.*;

// class chutki
// {
//     public static void m1()
//     {
//         for(int i=0 ; i<5;i++)
//         {
//         System.out.println("child thread");
//         }
//     }


//     public static void main(String[] args)
//     {
//         Runnable r= chutki::m1;// static method reference
//         Thread t = new Thread(r);

//         t.start();

//         for(int j=0; j< 5;j++)
//         {
//             try{
//             System.out.println("main thread");
//             Thread.sleep(1000);
//             }catch(InterruptedException e)
//             {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

//================================================================

// @FunctionalInterface
// interface dholakpurrr
// {
//     public abstract void play(int a);
// }

// class bheemmm
// {
//     public  void m1(int x)
//     {
//         System.out.println(x*x);
//     }
// }
// class chutkiiii
// {
   
//     public static void main(String[] args)
//     {
//         bheemmm b = new bheemmm();
//         dholakpurrr dpk = a -> b.m1(a);
//        // b.m1(10); // 100
//        dpk.play(10);// 100 
//     }
// }

//===============================================================================
interface dholakpurrr
 {
     public abstract void play(int a);
 }
class raju
{
    public void m1(int a)
    {
        System.out.println(a*a);
    }
}

class bholu
{
    public static void main(String[] args)
    {
        dholakpurrr r =  new raju()::m1;// instance method reference
        r.play(10);
    }
}

//==========================================================================

// class Sample
// {
// public void clock(String name)
// {
//     System.out.println("name is:" + name);
// }

// }
// @FunctionalInterface
// interface Interf
// {
// public abstract void ghost(String s);

// }
// public class Main {
// public static void main(String[] args){
//     Sample d= new Sample();
// Interf i = s -> d.clock(s);
// i.ghost("shashank");
// d.clock("raj");

// }
// }

//==================================================================================

// @FunctionalInterface
// interface Interf
// {
// public void m1(int i);
// }
// public class Main {
// public void m2(int i){
// System.out.println(i*i);
// System.out.println("logic coming from method reference...");
// }
// public static void main(String[] args){

// Interf i = x-> System.out.println(x);
// i.m1(10);//10
// System.out.println();
// //method reference(binding the body of m2() to abstract method


// Interf i1 = new Main()::m2;
// i1.m1(20);// 400
//             // logic coming from method reference

// }
// }

//================================================================================

// class Sample
// {
// public String clock(String name)
// {
//     //System.out.println("name is:" + name);
//     return name;
// }

// }
// @FunctionalInterface
// interface Interf
// {
// public abstract String ghost(String s);

// }
// public class Main {
// public static void main(String[] args){
//     Sample d= new Sample();
// Interf i = s -> d.clock(s); // if we are binding the lambda expression then the data type of argument as well as return type must be same.
//   System.out.println(i.ghost("shashank"));//shashank
//    System.out.println(d.clock("raj"));//raj

// }
// }

//==============================================================================


// class Sample
// {
// private String s;
// Sample(String s){
// this.s = s;
// System.out.println("Constructor executed...."+s);
// }
// }
// @FunctionalInterface
// interface Interf
// {
// public Sample get(String s);
// }
// public class Test {
// public static void main(String[] args){
// Interf i = s -> new Sample(s);
// i.get("from lambda expression...");// constructor executed from lambda expression
// System.out.println();
// //constructor reference
// Interf i1 = Sample::new;
// i1.get("from constructor reference....");// constructor executed from constructor reference

// }
// }

//====================================================================================

