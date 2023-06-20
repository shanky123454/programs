import java.io.*;
import java.util.*;
import java.lang.*;

class account implements Serializable
{
    String username ="shashank";
     transient int password = 1234567890;
    account()
    {
        System.out.println("account constructor is called");
    }
}
class susu
{
    public static void main(String[] args) throws Exception
    {
        account ac = new account();
        FileOutputStream fos = new FileOutputStream("acc.ser");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(ac);

        System.in.read();

        FileInputStream fis = new FileInputStream("acc.ser");
        ObjectInputStream ois =new ObjectInputStream(fis);
        account acc1=(account)ois.readObject();

        System.out.println(acc1.username);
        System.out.println(acc1.password);




    }
}
