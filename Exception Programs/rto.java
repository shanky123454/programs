import java.util.*;
import java.lang.*;

 class UnderAgeException extends Exception
{
    public UnderAgeException(String msg)
    {
        super(msg);
    }
}

 class OverAgeException extends Exception
{
    public OverAgeException(String msg)
    {
        super(msg);
    }
}
 class applicant{
 void verify() throws UnderAgeException , OverAgeException
    {    
    System.out.println("enter the age");
    Scanner sc =new Scanner(System.in);
    int age = sc.nextInt();

        if((age>=20) && (age<=60))
        {
            System.out.println("welcome to rto in meanwhile we will publish your DL");
        }
        else if(age < 20){
            UnderAgeException uae = new UnderAgeException("baccha ruko jara samay aane do");
            System.out.println(uae.getMessage());
            throw uae;
                }
        else{
            OverAgeException oae = new OverAgeException("chacha ab umar ho gyi hai arram kariye!");
            System.out.println(oae.getMessage());
            throw oae;
        }
    }
}
  class Rto{
    public void initiate() 
    {
        try{
            applicant p =new applicant();
            //p.input();
            p.verify();
        }
        catch(UnderAgeException | OverAgeException e)
        {
            try{
                applicant p =new applicant();
              //  p.input();
                p.verify();
                }
                catch(UnderAgeException | OverAgeException e1)
                {
                System.out.println("bs ab rahne do!");
                System.out.println(e1.toString());
                System.exit(0);
                }
        }
    }
}
  class randi{
    public static void main(String[] args)
    {
        Rto r = new Rto();
        r.initiate();
      
    }
}