import java.util.*;
import java.lang.*;
class student{
private String name;
private int roll;
public float marks;

public student(String name, int roll, float marks)
{
    this.name= name;
    this.roll=roll;
    this.marks =marks;
}

public String getname (String name)
{
    return name;
}

public int getroll(int roll)
{
    return roll;
}
public float getmarks(float marks)
{
    return marks;
}
public String toString()
    {
      return name+" " + roll+ " " + marks;
    }
}

    class main{
    public static void main(String[] args)
    {
        student s0= new student("shashank", 1, 99);
        student s1= new student("ritu", 2, 90);
        student s2 = new student("paglu", 3, 88);
    
    //     Object[] sa= new student[3];
    //     sa[0]=s0;
    //     sa[1]=s1;
    //     sa[2]=s2;
    
    // for (Object object : sa) {
    //     System.out.println(object);   
    // }

    // System.out.println("**********************************");

    ArrayList al = new ArrayList<>();
    al.add(s0);
    al.add(s1);
    al.add(s2);
    Iterator it = al.iterator();
    while(it.hasNext())
    {
        System.out.println(it.next());
    }
}

}
