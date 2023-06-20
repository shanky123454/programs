// Write a Program to Insert Employee Objects into the TreeSet where DNSO is Based on
// Ascending Order of EmployeeId and
// Customized Sorting Order is Based on Alphabetical Order of Names:

import java.util.*;
import java.lang.*;

class Emploooyee implements Comparable
{
    String name;
    int id;
    public Emploooyee(String name, int id)
    {
        this.name=name;
        this.id=id;
    }
    public String toString()
    {
        return name+ " " + id;
    }
    public int compareTo(Object obj)
    {
        Emploooyee e = (Emploooyee)obj;
        Integer i1= e.id;
        Integer i2= this.id;
        return i2.compareTo(i1);
    }
}

class marwadi
{
    public static void main(String[] args)
    {
    Emploooyee e1 = new Emploooyee("sachin", 10);
    Emploooyee e2 = new Emploooyee("ponting", 14);
    Emploooyee e3 = new Emploooyee("lara", 9);
    Emploooyee e4 = new Emploooyee("flintoff", 17);
    Emploooyee e5 = new Emploooyee("anwar", 23);

    TreeSet t = new TreeSet();
t.add(e1);
t.add(e2);// e2.compareTo(e1);
t.add(e3);
t.add(e4);
t.add(e5);
System.out.println(t);
System.out.println();

TreeSet t1 = new TreeSet<>(new Mycomparator11111());
t1.add(e1);
t1.add(e2);// e2.compare(e1);
t1.add(e3);
t1.add(e4);
t1.add(e5);

System.out.println(t1);
    }
}

class Mycomparator11111 implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        Emploooyee s1= (Emploooyee)obj1;
        Emploooyee s2= (Emploooyee)obj2;

        String n1= s1.name;
        String n2= s2.name;

        return n1.compareTo(n2);
    }
}