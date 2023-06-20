import java.io.*;

class boysss implements Serializable
{
     static transient int i=100;
      final transient int j=200;
    static{
        System.out.println("static block is called");
    }
    public boysss()
    {
        System.out.println("boysss constructor is called");
    }
}
class girlssssss
{
    public static void main(String[] args) throws Exception
    {
        boysss b= new boysss();
        FileOutputStream fos= new FileOutputStream("C:\\Users\\ASUS\\programs\\abcd.ser");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(b);
     

        System.in.read();

        FileInputStream fis = new FileInputStream("abcd.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        boysss b1 =(boysss)ois.readObject();
       

        System.out.println(b1.i);//100====> static variable is not part of object state hence they won't participate in
                                         // serialization because of this declaring a static variable as
                                         // transient there is no use.
        System.out.println(b1.j);//200===-> because of final keyword override transient 
             
// final variables will be participated into serialization directly by their values.
// Hence declaring a final variable as transient there is no use.
// //the compiler assign the value to final variable
// eg: final int x= 10;
// int y = 20;
// System.out.println(x);// compiler will replace this as System.out.println(20)
// becoz x is final.
// System.out.println(y);
    }
}
