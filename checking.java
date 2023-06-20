import java.util.*;
import java.lang.*;
class Paddu{
    public static void main (String[]args) throws Exception
    {
        Paddu p =new Paddu();
        //System.out.println(p instanceof Thread);//C.E
        System.out.println(p instanceof Object);
        System.out.println(p instanceof Paddu);
        System.out.println(Class.forName(args[0]).isInstance(p));   
    }
}