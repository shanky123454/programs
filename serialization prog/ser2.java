import java.io.*;

class boyss implements Serializable
{
    int i=100;
     int j=200;
    static{
        System.out.println("static block is called");
    }
    public boyss()
    {
        System.out.println("boyss constructor is called");
    }
}
class girlssss
{
    public static void main(String[] args) throws Exception
    {
        boyss b= new boyss();
        FileOutputStream fos= new FileOutputStream("abcd.ser");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(b);
     

        System.in.read();

        FileInputStream fis = new FileInputStream("abcd.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        boyss b1 =(boyss)ois.readObject();
       

        System.out.println(b1.i);//100
        System.out.println(b1.j);//0===-> because of transient 

    }
}
