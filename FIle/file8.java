// Requirement => Write a program to remove duplicates from the file

import java.lang.*;
import java.util.*;
import java.io.*;
      
class gui
{
    public static void main(String[] args) throws Exception
    {
      
        PrintWriter pw = new PrintWriter("file5.txt");
        BufferedReader br = new BufferedReader(new FileReader("duplicate.txt"));
        String s = br.readLine();
        
        while(s!=null)
        {
            BufferedReader br1= new BufferedReader(new FileReader("file5.txt"));
            String s1= br1.readLine();
            boolean isavailable =false;
            while(s1!=null)
            {
               if(s.equals(s1))
               {
               // pw.println(s);
               isavailable = true;
               break;
               }
                s1=br1.readLine(); 
            }
               if(isavailable==false)
               {
                  pw.println(s);
                  pw.flush();
                 
               }
               s=br.readLine();
               
            }
        }
    }
