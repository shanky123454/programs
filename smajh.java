// import java.util.*;
// import java.lang.*;

//  class socgen
// {
//     public static void main(String[] args)
//     {
//         Integer i1= 10;
//        // Float f1=null;
//          Number n1=null;
//          n1=(Number)i1;//> no error bcz number and integer have child-parent relationship
//          //f1= (Float) i1;//==>error: incompatible types: Integer cannot be converted to Float because both are class and there is not child-parent relationship between them.
//          //System.out.println(f1);//error
//          System.out.println(n1);
//     }
// }

//====================================================================================


import java.util.*;
class TreeSetDemo {

public static void main(String[] args) {

TreeSet t = new TreeSet();
t.add(new StringBuffer("A"));
t.add(new StringBuffer("Z"));
t.add(new StringBuffer("K"));
t.add(new StringBuffer("L"));
System.out.println(t);
System.out.println();

TreeSet t1 = new TreeSet();


t1.add(new StringBuilder("A"));
t1.add(new StringBuilder("Z"));
t1.add(new StringBuilder("K"));
t1.add(new StringBuilder("L"));
System.out.println(t1);

}
}
//====================================================================================

// import java.util.*;
// class Employee implements Comparable {

// String name;
// int eid;
// Employee(String name, int eid) {
// this.name = name;
// this.eid = eid;
// }
// public String toString() { return name+"-----"+eid;}
// public int compareTo(Object obj) {
// int eid1 = this.eid;
// Employee e = (Employee)obj;
// int eid2 = e.eid;
// if(eid1 < eid2) return -1;
// else if(eid1 > eid2) return 1;
// else return 0;
// }
// }
// class Test {
// public static void main(String[] args) {
// Employee e1 = new Employee("sachin", 10);
// Employee e2 = new Employee("ponting", 14);
// Employee e3 = new Employee("lara", 9);
// Employee e4 = new Employee("flintoff", 17);
// Employee e5 = new Employee("anwar", 23);
// TreeSet t = new TreeSet();
// t.add(e1);
// t.add(e2);//e2.compareTo(e1);
// t.add(e3);
// t.add(e4);
// t.add(e5);
// System.out.println(t);
// }
// }