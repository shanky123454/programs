import java.util.*;

import javax.annotation.processing.FilerException;

import java.io.*;
import java.lang.*;
class doraemon
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("C:\\Users\\ASUS","tuffy.txt");
        FileWriter fw= new FileWriter("shanky.txt",false);
        FileWriter fe = new FileWriter(f,false);
        fw.write("shashank raj");
        fw.write("\n");
        fw.write("societe\ngenerale");
        fw.write("\n");
        fw.write(97);//a
        fw.write("\n");
        fw.write('a');//a
        fe.write("fhanky");
        fe.write("\n");
        fe.write("investment and corporation banking");
        fe.write("\n");
        char[] c ={'1','2','3'};
        fe.write(c);//123
        fw.flush();
        fw.close();
        fe.flush();
        fe.close();

        FileReader fr = new FileReader("shanky.txt");
    // FileReader fr = new FileReader(f);
    //     int i= fr.read();// read character by character from the file and returns its unicode value so while printing we have to explicitly convert it to char
    //     while(i!=-1)
    //     {
    //     System.out.println((char)i);
    //     i=fr.read();// read the next char from the file .
    //     }
    //     fr.close();

           File h = new File("shanky.txt");
           FileReader g = new FileReader("shanky.txt");
           char[] cc = new char[(int)h.length()];
              int i= g.read(cc);//reads & returns all the character in the file and put into char cc array.
              System.out.println(i);
           for (char d : cc) {
            System.out.println(d);
           }
         


    }
}