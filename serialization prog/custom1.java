import java.io.*;
import java.util.*;
import java.lang.*;

class accounttt implements Serializable
{
    String username ="shashank";
     transient String password = "raj";
     transient int pin =4444;
    accounttt()
    {
        System.out.println("account constructor is called");
    }

    private void writeObject(ObjectOutputStream oos) throws Exception
    {
        oos.defaultWriteObject();        // to perform default serialization of Account object.
        String encrypt = "123" + password;// epwd (encrypted password)
        int enpin = 5555;// enpin (encrypted pin)
        oos.writeObject(encrypt);// writing encrypted password to the file
        oos.writeObject(enpin);// writing encrypted pin to the file
    }
    private void readObject(ObjectInputStream ois) throws Exception
    {
        ois.defaultReadObject();// performing default deserialization of Account object
        String crypt= (String)ois.readObject();// deserializing the encrypted password from the file
        password=crypt.substring(3);// decrypting it and saving it to the original password
                                               // string starting from 3rd  index till the last index
        int depin = (int)ois.readObject();
        pin  = depin-1111; 
       
    }

//     We can implements customized serialization by using the following two methods.
// 1. private void writeObject(ObjectOutputStream os) throws Exception.
// => This method will be executed automatically by jvm at the time of
// serialization.
// => Hence at the time of serialization if we want to perform any extra work we
// have to define that in this
// method only. (prepare encrypted password and write encrypted password
// seperate to the file )
// 2. private void readObject(ObjectInputStream is) throws Exception.
// => This method will be executed automatically by JVM at the time of
// Deserialization.
// Hence at the time of Deserialization if we want to perform any extra activity
// we have to define that in this method only.
// (read encrypted password , perform decryption and assign decrypted password
// to the current object password variable )

}
class susuuuu
{
    public static void main(String[] args) throws Exception
    {
        accounttt ac = new accounttt();
        FileOutputStream fos = new FileOutputStream("acc.ser");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(ac);
        // writeObject() method on Account class will
        // be automatically called by jvm

        System.in.read();

        FileInputStream fis = new FileInputStream("acc.ser");
        ObjectInputStream ois =new ObjectInputStream(fis);
        accounttt acc1 =(accounttt)ois.readObject();
 

        System.out.println(acc1.username);
        System.out.println(acc1.password);
        System.out.println(acc1.pin);
    }
}

//=========================================================================

// class Account implements Serializable{
//     String name="sachin";
//     transient String password="tendulkar";
//     private void writeObject(ObjectOutputStream oos)throws Exception{
//     oos.defaultWriteObject();//performing default Serialization
//     String epwd="123"+password;//performing encryption
//     oos.writeObject(epwd);//write the encrypted data to file(abc.ser)
//     }
//     private void readObject(ObjectInputStream ois)throws Exception{
//     ois.defaultReadObject();//performing default Serialization
//     String epwd=(String)ois.readObject();//performing decryption
//     password=epwd.substring(3);//writing the extra data to Object
//     }
//     }
//      class Test {
//     public static void main(String[] args)throws
//     IOException,ClassNotFoundException{
//     Account acc=new Account();
//     System.out.println(acc.name +"=====> "+ acc.password);
//     System.out.println("Serialization Started");
//     FileOutputStream fos= new FileOutputStream("abcdef.ser");
//     ObjectOutputStream oos=new ObjectOutputStream(fos);
//     oos.writeObject(acc);
//     System.out.println("Serialization ended");
//     System.out.println("***********************************");
//     System.out.println("DeSerialization Started");
//     FileInputStream fis= new FileInputStream("abcdef.ser");
//     ObjectInputStream ois=new ObjectInputStream(fis);
//     acc=(Account)ois.readObject();
//     System.out.println(acc.name +"=====> "+ acc.password);
//     System.out.println("DeSerialization ended");
    
//     }
// }
