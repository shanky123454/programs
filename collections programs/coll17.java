import java.util.*;
import java.lang.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface i2{ //-->> we create user type annotations by placing @ before interface 

}
interface i1{
    public abstract void hello();
          default void byee()
           {
            System.out.println("byee shashank");
            hilo();
           }

           public static void help()
           {
            System.out.println("help others as much as possible");
            bolo();
            
           }

           private static void bolo()
           {
            System.out.println("bolo bhai jldi");
            
           }

           private void hilo()
           {
            System.out.println("manzil jb tk nhi mile tb tk mehnat kro");
             
           }
}
class collui implements i1{

    public void hello()
    {
        System.out.println("say hello");
    }
    public static void main(String[] args)
    {
        collui c= new collui();
        c.byee();
        c.hello();
        i1.help();
    
   
       
    }
}