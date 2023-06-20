import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

class input{
    public static void main(String[] args) throws IOException
    {
        System.out.println("enter the name of the student");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      // Scanner br = new Scanner(System.in);
        String name = br.readLine();
       // String name = br.nextLine();
       //String name = br.next();

        System.out.println("name is"  +"\t"+ name);
    }
}
