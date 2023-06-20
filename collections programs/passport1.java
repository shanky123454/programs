import java.util.*;
import java.lang.*;

class Info{
    private String name;
    private int age;
    private String address;

    public  Info(String name, int age, String addres)
    {
        this.name= name;
        this.age =age;
        this.address= addres;
    }
    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
    public String address()
    {
        return address;
    }
    public String toString()
    {
        return name+ " " + age+ " " + address;
    }
}

class key{
    private String s;
    public key(String s)
    {
        this.s= s;
    }
    public String getkey()
    {
        return s;
    }
}
class tanya111{

    public static void main(String[] args)
    {
            boolean b =false;
            Info i1= new Info("shanky", 22, "bangalore");
            Info i2= new Info("ritu", 22, "delhi");
            Info i3= new Info("paglu", 22, "dehradhun");
            Info i4= new Info("mental", 22, "sikkim");
            LinkedHashMap lhm= new LinkedHashMap<>();//=> it uses hashtable as data structure and linkedlist and implements Map interface.
            lhm.put(1, i1);
            lhm.put(2, i2);
            lhm.put(3, i3);
            lhm.put(4, i4);
            Set s = lhm.entrySet();
            Iterator it =s.iterator();
            System.out.println("enter the passport number");
            Scanner sc= new Scanner(System.in);
            Integer keyString = sc.nextInt();
            
            while(it.hasNext())
            {
                Map.Entry t= (Map.Entry) it.next();
                Integer i = (Integer)t.getKey();
                if(i==keyString){
                    b=true;
                System.out.println("key =" + " " + t.getKey() + " " +"value =" + t.getValue());
                }
            }
            if(b==false)
            {
                System.out.println("Invalid key ");
            }
    }
}