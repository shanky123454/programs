import java.util.*;
import java.lang.*;
class gf1
{
    //methodOne(ArrayList<?> l):
     //We can use this method for ArrayList of any type but within the method
      //we can't add anything to the List except null.
      //This method is useful whenever we are performing only read operation.
    public void dona1(ArrayList<?>al) //==> 2nd type example of argument type parameter
    {
          Iterator it= al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
class Meow1
{
    public static void main(String[] args)
    {
        ArrayList a = new ArrayList<String>();
        a.add(5);
        a.add(10);
        a.add("shashank");
        gf1 f = new gf1();
        f.dona1(a);
        System.out.println();
        Iterator it= a.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}