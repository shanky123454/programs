import java.util.*;
import java.lang.*;
class gf
{
    public void dona(ArrayList<Integer> al) //==> 1st type example of argument type parameter
    {
          al.add(5);
          al.add(10);

          Iterator it= al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
class Meow
{
    public static void main(String[] args)
    {
        ArrayList a = new ArrayList<Integer>();
        gf f = new gf();
        f.dona(a);
        Iterator it= a.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}