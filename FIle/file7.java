// Requirement => file1.txt file2.txt copy one line from file1.txt and from file2.txt
// to file4.txt.
import java.io.*;
import java.lang.*;
import java.util.*;
class fuii
{
    public static  void main(String[] args) throws Exception
    {
      PrintWriter pw = new PrintWriter("file4.txt");

      BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
       String s= br.readLine();
      
       BufferedReader br1 = new BufferedReader(new FileReader("bull.txt"));
       String s1= br1.readLine();

       while(s!=null || s1!=null)
       {
         if(s!=null)
         {
            pw.println(s);
           s= br.readLine();
         }

         if(s1!=null)
         {
          pw.println(s1);
          s1=br1.readLine();
         }
       }
       pw.flush();
       br.close();
       br1.close();
    }
}