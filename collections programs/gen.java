import java.util.*;
import java.lang.*;

 class employee<T> //generic class with unbounded parameter example how to create and assign the values
{
    T obj;
    public employee(T obj)
    {
        this.obj=obj;
    }

    public void paisa()
    {
        System.out.println("paisa do employee ko");
    }
    public T getObj()
    {
        return obj;
    }
}
class Main{
    public static void main(String[] args)
    {
        employee e1 =new employee("sachin");
        employee e2 = new employee("dhoni");
        String s1=(String)e1.getObj();
        System.out.println(s1);
        String s2= (String)e2.getObj();
        System.out.println(s2);
        e1.paisa();
        e2.paisa();
    }
}