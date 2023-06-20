import java.util.*;
import java.util.Date;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class javadate1 {
    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the D.O.M : (dd-MM-yyyy)");
        String date = sc.next();
        SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
        // String s=sdf.format(date);
        java.util.Date d = sdf.parse(date);
        // d= sdf.format(date);
        long  l =d.getTime();
        java.sql.Date dateu  = new java.sql.Date(l);
        System.out.println(dateu);

        System.out.println("=====================================================");
        System.out.println("enter the D.O.M : (yyyy-MM-dd)");
        String dat = sc.next();
        java.sql.Date  qwerty = java.sql.Date.valueOf(dat);
        System.out.println(qwerty);
    }
}
