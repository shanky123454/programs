import java.util.*;
import java.lang.*;
import java.lang.annotation.*;  
import java.lang.reflect.*;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.Type,ElementType.METHOD,ElementType.PACKAGE})
@interface player
{
    int run() default 100000;
    String country() default "india";
    // int run();
    // String country();
}

//@player(country="india",run= 10000)
@player
class virat
{
    public int innings;
    public String name;
    public int getInnings() {
        return innings;
    }
    public void setInnings(int innings) {
        this.innings = innings;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Maimmmmmmmmmmm
{
    public static void main(String[] args)
    {
        virat v = new virat();
        v.setInnings(100);
        v.setName("VK");
        System.out.println(v.getInnings() + " " + v.getName()+ " " + v.getClass().getName());
        Class c = v.getClass();
        Annotation vt = c.getAnnotation(player.class);
        player p = (player) vt;
        int runs = p.run();
        System.out.println(runs);
        String c1 = p.country();
        System.out.println(c1);
       
    }

}