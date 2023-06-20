import java.util.*;
import java.lang.*;
class box<S>
{
    public S obj;
    public S getObj() {
        return obj;
    }
    public void setObj(S obj) {
        this.obj = obj;
    }
    // public box(T t)
    // {
    //     this.obj=t;
    // }

    //public <U extends Number> void shape(U u)//error
    public <U extends Object> void shape(U u)
    {
       System.out.println(obj.getClass().getName());
       System.out.println(u.getClass().getName());
       System.out.println(obj.getClass());

    }
}
 class Muon{
    public static void main(String[] args)
    {
            box b=new box();
            b.setObj(new String("shashank"));
            System.out.println(b.getObj());
            b.shape("rectangular");
           System.out.println( b.getObj().getClass().getName()); 
    }
}