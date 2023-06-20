import java.io.*;

class oneplus implements Serializable
{
      int i=10;
        public oneplus()
        {
            System.out.println("inside oneplus constructor");
        }
}

class oneplusnord extends oneplus
{
    int j=20;
    public oneplusnord()
    {
        System.out.println("inside one plus nord");
    }
}
class one
{
    public static void main(String[] args) throws Exception
    {
        oneplusnord o = new oneplusnord();
        FileOutputStream fos= new FileOutputStream("one.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(o);

        FileInputStream fis= new FileInputStream("one.ser");
        ObjectInputStream ois= new ObjectInputStream(fis);
        oneplusnord op= (oneplusnord)ois.readObject();

        System.out.println(op.i);
        System.out.println(op.j);

    }
}
