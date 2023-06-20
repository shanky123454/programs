//Requirement => file1.txt ,file2.txt copy all the contents to file3.txt

import java.io.*;
import java.lang.*;
import java.util.*;

class lebraaaaaa
{     
    public static void main(String[] args) throws Exception
    {
        PrintWriter pw = new PrintWriter("file3.txt");
        File f = new File("C:\\Users\\ASUS\\programs","bull.txt");  
           BufferedReader b = new BufferedReader(new FileReader("bull.txt"));
            char[] c = new char[(int)f.length()];
      int i= b.read(c);
      for (char d : c) {
            pw.print(d);
      }
      pw.flush();
     
     //PrintWriter  pw1 = new PrintWriter("file3.txt");
     File   f1 = new File("C:\\Users\\ASUS\\programs","file1.txt");  
    BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
            char[] cc = new char[(int)f1.length()];
      int ii= br.read(cc);
      for (char dd : cc) {              
            pw.print(dd);
      }


      pw.flush();
      br.close();
     
        }
       
    }
