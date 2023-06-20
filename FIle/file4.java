import java.io.*;
import java.util.*;
import java.lang.*;
class golu
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("C:\\Users\\ASUS", "bull.txt");
        FileWriter fuck = new FileWriter("bull.txt",false);
        FileReader fr = new FileReader("bull.txt");
        BufferedWriter bw = new BufferedWriter(fuck);
        bw.newLine();
        bw.write(100);//d
        bw.newLine();
        bw.write("shashank");//shashank
        bw.newLine();
        char[] c = {'1','2','3'};//123
        bw.write(c);
        bw.flush();


        BufferedReader br = new BufferedReader(fr);
        //  int  i=br.read();
        //  while(i!=-1)
        //  {
        //     System.out.println((char)i);
        //     i= br.read();
        //  }
        //==================================
        // char[] cn = new char[(int)f.length()];
        //     br.read(cn);
        //     for (char d : cn) {
        //         System.out.println(d);
        //     }
        //===================================
        String str= br.readLine();
        while(str!=null)
        {
            System.out.println(str);
            str=br.readLine();
        }

    }
}