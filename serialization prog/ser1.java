import java.io.*;
import java.lang.*;
import java.util.*;

class boy implements Serializable
{
    int i=10;
    int j=20;
    static{
        System.out.println("static block is called");
    }
    public boy()
    {
        System.out.println("boy constructor is called");
    }
}

class boy1 implements Serializable
{
    int i=100;
    int j=200;
    
    static{
        System.out.println("static block is called");
    }
    public boy1()
    {
        System.out.println("boy1 constructor is called");
    }
}
class girlyippa
{
    public static void main(String[] args) throws Exception
    {
        boy b= new boy();
        boy1 bb = new boy1();
        FileOutputStream fos= new FileOutputStream("abc.ser");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(b);
        oos.writeObject(bb);

        System.in.read();

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // boy b1 =(boy)ois.readObject();
        // boy1 bb1 =(boy1)ois.readObject();
         
        // boy1 bb1 =(boy1)ois.readObject();///==>> errors bcz order of seriallization 
        // boy b1 =(boy)ois.readObject();//=> is different from order of deserialization
        // We can serialize any no of objects to the file but in which order we serialized in
         // the same order only we have to deserialize,
         // if we change the order then it would result in "ClassCastException".

         // solution if we don't know the order by using instanceof 

         Object obj1 = ois.readObject();
         
         
         Object obj = ois.readObject();
         if(obj instanceof boy)
         {
            boy b1= (boy)obj;
        System.out.println(b1.i);
        System.out.println(b1.j);
         }

        


    }
}