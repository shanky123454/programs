import java.util.*;
import java.lang.*;
import java.util.function.*;
//===============================================================
// javap java.util.function.Consumer
// Compiled from "Consumer.java"
// public interface java.util.function.Consumer<T> {
//   public abstract void accept(T);

  //==============================================================
class Myconsumer implements Consumer<String>
{
    public void accept(String name)
    {
        System.out.println(name);
    }
}
class nobita
{
    public static void main(String[] args)
    {
        ArrayList<String> al= new ArrayList<String>();
        al.add("shashank");
        al.add("ritu");
        al.add("pagal");
        
        // System.out.println(al);
        //traditional approach
       Consumer c= new Myconsumer();
       al.forEach(c);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
       al.forEach(name-> System.out.println(name));
       System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
       al.forEach(System.out:: println);
    }
}