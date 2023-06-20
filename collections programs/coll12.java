import java.util.*;
import java.lang.*;
class employee{
    public String name;
    public int age;

    public employee(String name, int age)
    {
        this.name=name;
        this.age =age;
    }
    @Override
    public String toString()
    {
        return name+" " + age;
    }

    @Override
    public void finalize()//==> hashmap override the garbage collector method and don,t call the finalize method
    {
        System.out.println("clearing the objects");
    }

}

class tanya12{
    public static void main(String[] args)
    {
        employee e = new employee("shanky", 22);
        //employee e1 = new employee("shanky", 22);
        HashMap h = new HashMap<>();//==> uses hashtable as data structure and implement Map interface
        h.put(e,"shanky");

         Collection c = h.values();
         Iterator i = c.iterator();
         while(i.hasNext())
         {
            System.out.println(i.next());
         }
         e=null;
         //e1=null;

         System.gc();
    }
}