import java.util.*;
import java.io.*;
import java.lang.*;
// present in -> java.io.File;
// constructors of file
// public java.io.File(java.lang.String);
// public java.io.File(java.lang.String, java.lang.String);
// public java.io.File(java.io.File, java.lang.String);

class molu
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("abc.txt");
        System.out.println(f.exists());// false

        f.createNewFile();
        System.out.println(f.exists());//true

    //A java File object can represent a directory also.
    //In UNIX everything is a file, java "file IO" is based on UNIX operating
    //system hence in java also we can represent both files and directories by File 
    //object only.

    File f1 = new File("hello");
    System.out.println(f1.exists());
    f1.mkdir();
    System.out.println(f1.exists());
    //file class constructor

    //   File f3= new File("choo");
    //   f3.mkdir();
    // File f4 = new File("choo", "chintu.txt");
    // f4.createNewFile();
      
      File f5 = new File("C:\\Users\\ASUS");
      f5.mkdir();
      String[] arr=f5.list();
      for (String string : arr) {
        System.out.println(string);
      }
      long  l= f5.length();// returns the no of characters from the file(f5)
      System.out.println(l);
       System.out.println(f5.isDirectory());
       System.out.println(f5.isFile());
      System.out.println("+++++++++++++++++++++++++++++++");
      File f6 = new File(f5, "pintu.txt");
      f6.createNewFile();
      System.out.println(f6.isFile());
        System.out.println("++++++++++++++++++++++++");
      //Requirement: Write code to create a file named with rcb.txt present in "C:\Users\ASUS\choo"
      //folder.
    //   File fo = new File("C:\\Users\\Asus\\choo");
    //   fo.createNewFile();
    //   System.out.println(fo.isDirectory());

      File fg= new File("C:\\Users\\Asus\\choo");
      //fg.mkdir();
      long c = fg.length();
      System.out.println(c);
      String[] d = fg.list();
      for (String sysout : d) {
        System.out.println(sysout);
      }

      fg.delete();
     
    }
}