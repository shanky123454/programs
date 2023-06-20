import java.io.*;
import java.util.*;
import java.lang.*;

class choota implements Externalizable
{
    String username ="shashank raj";
     transient int passwords = 1234;
     int i=200;
     int j=300;
     int k =900;
     // private static final long serialVersionUID=89990;

     public choota()
    {
        System.out.println("choota constructor is called");
    }
   
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(username);
        out.writeInt(passwords);
        
    }
   
    public void readExternal(ObjectInput ins) throws IOException, ClassNotFoundException {
       username=(String)ins.readObject();
       passwords=ins.readInt();
        
    }
}
class chudai
{
    public static void main(String[] args) throws IOException,ClassNotFoundException
    {
        choota acd = new choota();
        FileOutputStream fos = new FileOutputStream("sexy.ser");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(acd);

        System.in.read();

        FileInputStream fis = new FileInputStream("sexy.ser");
        ObjectInputStream ois =new ObjectInputStream(fis);
        choota accfuck=(choota)ois.readObject();

        System.out.println(accfuck.username);
        System.out.println(accfuck.passwords);




    }
}

//======================================================================
// Externalization : ( 1.1 v )
// 1. In default serialization every thing takes care by JVM and programmer doesn't
// have any control.
// 2. In serialization total object will be saved always and it is not possible to
// save part of the object , which creates
// performance problems at certain point.
// 3. To overcome these problems we should go for externalization where every thing
// takes care by programmer and JVM
// doesn't have any control.
// 4. The main advantage of externalization over serialization is we can save either
// total object or part of the object based on
// our requirement.
// 5. To provide Externalizable ability for any object compulsory the corresponding
// class should implements externalizable
// interface.
// 6. Externalizable interface is child interface of serializable interface.
// Externalizable interface defines 2 methods :
// 1. writeExternal(ObjectOutput out ) throws IOException
// 2. readExternal(ObjectInput in) throws IOException,ClassNotFoundException
// public void writeExternal(ObjectOutput out) throws IOException
// This method will be executed automatically at the time of Serialization with in
// this
// method , we have to write code to save required variables to the file .
// public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException

// This method will be executed automatically at the time of deserialization with
// in this
// method , we have to write code to save read required variable from file and
// assign to the
// current object.
// At the time of deserialization JVM will create a seperate new object by executing
// public no-arg constructor
// on that object JVM will call readExternal() method.
// Every Externalizable class should compusory contains public no-arg constructor
// otherwise we will get
// RuntimeExcepion saying "InvaidClassException" .
