import java.util.*;
import java.io.*;
import java.lang.*;

class ert{
    public static void main(String[] args) throws FileNotFoundException
    {
        PrintWriter pw = new PrintWriter("string.txt");
        pw.write("shashank");
        pw.write(34);
        pw.print("raj");
        pw.print(34);
        pw.println('a');
        pw.println("shanky");
        pw.flush();
    }
}