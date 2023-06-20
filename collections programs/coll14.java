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
    public void finalize()
    {
        System.out.println("clearing the objects");
    }

}

class tanya120{
    public static void main(String[] args)
    {
        employee e = new employee("shanky", 22);
        employee e1 = new employee("shanky", 22);
        IdentityHashMap h1 = new IdentityHashMap<>();//==>uses hashtable as data structure and implement Map interface
        IdentityHashMap h2 = new IdentityHashMap<>();
        IdentityHashMap h3 = new IdentityHashMap<>();


        h1.put(10,"shanky");
        h2.put(10, "shanky");
        h3.put(15, "shanky");

        //h.put(2, e1);
        System.out.println(h1.entrySet().equals(h2.entrySet()));// true
        System.out.println(h1.entrySet().equals(h3.entrySet()));// false
        System.out.println(h1.equals(h2));// true
        System.out.println(h1.equals(h3));// false


    }
}