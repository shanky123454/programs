import java.io.*;
import java.lang.*;
import java.util.*;

// Object graph in serialization:
// 1. Whenever we are serializing an object the set of all objects which are reachable
// from that object will be serialized automatically. 
// This group of objects is nothing but object graph in serialization.
// 2. In object graph every object should be Serializable otherwise we will get
// runtime exception saying "NotSerializableException".


class chor implements Serializable
{
    int i=200;
}
class chamcha implements Serializable
{
    chor ch = new chor();
}
class mohalla implements Serializable
{
    chamcha c = new chamcha();
}
class don
{
    public static void main(String[] args) throws Exception
    {
        mohalla m = new mohalla();
        FileOutputStream fos = new FileOutputStream("chor.ser");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(m);

        System.in.read();


        FileInputStream fis= new FileInputStream("chor.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
         mohalla mo = (mohalla) ois.readObject();

         System.out.println(mo.c.ch.i);


    }
}
