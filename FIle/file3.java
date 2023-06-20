// Requirement: Write a program to display the names of all files and directories
// present in C:\Users\ASUS\programs
import java.util.*;
import java.io.*;
import java.lang.*;

class bootu
{
    public static void main(String[] args)
    {
        int countcpp=0;
        int countjava=0;
        int countdotclass=0;
        int directory=0;
        int counttxt=0;
        File f = new File("C:\\Users\\ASUS\\checking");
        //f.mkdir();
        String[] s= f.list();
        for (String string : s) {
           // File f1= new File("C:\\Users\\ASUS\\checking", string);
            File f1= new File(f, string);
            if(f1.isDirectory())
            {
                directory++;
            }
            else if(f1.isFile())
            {
                if(string.endsWith(".class.txt"))
                {
                    countdotclass++;
                }
                else if(string.endsWith(".cpp.txt"))
                {
                    countcpp++;
                }
                else if(string.endsWith(".java.txt"))
                {
                    countjava++;
                }
                else
                {   
                    counttxt++;
                }
            }
            System.out.println(string);
        }
        System.out.println("no of .class file=" + countdotclass);
        System.out.println("no of .c++ file =" + countcpp);
        System.out.println("no of directory="+ directory);
        System.out.println("no of .java file:" + countjava);
        System.out.println("no of txt file = "+ counttxt);
        long c = f.length();
        System.out.println(c);
    }
}