// Write a code to read the data from the file and identify which data is of larger in
// length(assuming the data is String)
import java.lang.*;
import java.util.*;
import java.io.*;

class chutiya1234
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bf= new BufferedReader(new FileReader("file5.txt"));
        String s= bf.readLine();
        int max=0;
        String maxi=null;
        while(s!=null)
        {
            if(s.length()>max)
            {
                max= s.length();
                maxi = s;
              
            }
            else{

            }
            s=bf.readLine();
        }
        System.out.println("largest data is:" + maxi);

    }
}