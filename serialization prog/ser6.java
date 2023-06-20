import java.io.*;

class oneplusss 
{
      int i=10;
         public oneplusss()  //int i
          {
             System.out.println("inside oneplus constructor");
         }
}

class oneplusnorddd extends oneplusss implements Serializable
{
    int j=20;
    public oneplusnorddd()
    {
        //super(5);// point 4th is valid here we can only pass non-parameterise constructor 
        System.out.println("inside one plus nord");
    }
}
class oneeeeeee
{
    public static void main(String[] args) throws Exception
    {
        oneplusnorddd o = new oneplusnorddd();
        o.i=999;
        o.j=888;
        System.out.println("serialization started");
        FileOutputStream fos= new FileOutputStream("onepl.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(o);
        System.out.println("serialization ended");

        System.in.read();

        System.out.println("deserialization started");

        FileInputStream fis= new FileInputStream("onepl.ser");
        ObjectInputStream ois= new ObjectInputStream(fis);
        oneplusnorddd op= (oneplusnorddd)ois.readObject();
        

        System.out.println(op.i);
        System.out.println(op.j);
        System.out.println("deserialization ended");

    }
}

//======================================================================

// 1. Even though parent class does not implementsSerializable we can serialize child
// object if child class implements Serializable
// interface.
// 2. At the time of serialization JVM ignores the values of instance variables which
// are coming
// from non Serializable parent then instead of original value JVM saves default
// values for those variables to the file.
// 3. At the time of Deserialization JVM checks whether any parent class is non
// Serializable or not.
// If any parent class is nonSerializable JVM creates a separate object for every
// non Serializabl parent and
// shares its instance variables to the current object.
// 4. To create an object for non-serializable parent JVM always calls no arg
// constructor
// (default constructor) of that non Serializable parent hence every non
// Serializable parent should compulsory contain
// no arg constructor otherwise we will get runtime exception
// "InvalidClassException".
// *** 4th point is optional so if you write parent class non-parameterized 
// constructor then two times parent class non-parameterized constructor will called.
//if we write parameterized parent class constructor then it will lead to runtime 
//exception in our code called "InvalidClassException". 
// if not written then code will also work good. 