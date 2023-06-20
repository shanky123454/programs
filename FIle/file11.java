import java.util.*;
import java.io.*;
 public class file11
{
    public static void main(String[] args) throws IOException
    {
        //FileInputStream fis = new FileInputStream("C:\\Users\\ASUS\\git\\repository\\jdbc demo\\application.properties"); // jdbc:mysql:///student  root  Shanky@123
        //FileInputStream fis = new FileInputStream("C:\\Users\\ASUS\\programs\\app.properties");// com.gmail  shanky  shanky@123
         FileInputStream fis = new FileInputStream("C:\\Users\\ASUS\\programs\\hurray.txt");// com.gmail  shanky  shanky@123

        Properties p = new Properties();
        p.load(fis);

        String url = p.getProperty("url");
        String user = p.getProperty("user");
        String password = p.getProperty("password");

        System.out.println(url+" " + user +" " + password);


    }
}