import java.util.*;
import java.lang.*;

class IllegalCustomerException extends Exception
{
    public IllegalCustomerException(String msg)
    {
        super(msg);
    }
}
class Atm{
    String userid= "shanky";
    int password = 12345;
    String uid="";
    int pwd;
    public void input()
    {
        System.out.println("enter the username");
        Scanner sc = new Scanner(System.in);
        uid= sc.nextLine();
        pwd =sc.nextInt();
    }
    public void verify() throws IllegalCustomerException
    {
        if((userid.equalsIgnoreCase(uid)) && (pwd==password))
        {
            System.out.println("authorized access : take your cash!");
        }
        else{
            IllegalCustomerException e =  new IllegalCustomerException("wrogn input try again!");
            System.out.println(e.getMessage());
            throw e;
        }

    }
}
class Bank{
    public void initiate()
    {
        try{
        Atm a = new Atm();
        a.input();
        a.verify();
        }
        catch(IllegalCustomerException e)
        {
            try{
                Atm a = new Atm();
                a.input();
                a.verify();
                }
                catch(IllegalCustomerException e1)
                {
                    try{
                        Atm a = new Atm();
                        a.input();
                        a.verify();
                        }
                        catch(IllegalCustomerException e2)
                        {
                            System.out.println("chor kahi ka!");
                            System.exit(0);
                        }
                }
        }
    }
}
class loot{
    public static void main(String[] args)
    {
        Bank b = new Bank();
        b. initiate();
    }
}