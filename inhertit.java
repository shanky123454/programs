import java.util.*;
import java.lang.*;

class animal{
    protected void bark()
    {
        System.out.println("animal is barking");
    }
}

class bhook extends animal{
    public void meow()
    {
        System.out.println("cat is weowing");
    }
    public void bark()
    {
        System.out.println("animal is barking again");
    }
}




class inherit extends bhook{

    @Override
    public void bark()
    {
        System.out.println("dog is braking");
        super.bark();
    }
    public static void main(String[] args)
    {
        animal d = new inherit();
        d.bark();
       
     animal d1 =new animal();    
       d1.bark();
        
    }
}