
import java.sql.*;

class golang
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        Connection connection =null;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("driver loaded sucessfully");

        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Shanky@123");
       System.out.println("connection get establish");
       System.out.println(connection.getClass().getName());

       String sqlquery = "select id,name,city,phone_number from student_info";
       Statement statement = connection.createStatement();
       ResultSet resultSet = statement.executeQuery(sqlquery);
       System.out.println("Id\tName\tCity\tPhone_number");

       while(resultSet.next())
       {
        Integer sid= resultSet.getInt(1);
         String sname=resultSet.getString(2);
         String scity=resultSet.getString(3);
         String sphone=resultSet.getString(4);

         System.out.println(sid+"\t"+sname+"\t"+scity+"\t"+sphone );
       }

    }catch(ClassNotFoundException cne)
    {
       cne.printStackTrace();
    }catch(SQLException se)
    {
        se.printStackTrace();
    }
    if(connection!=null)
    {
        try{
        connection.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
     
        
    }
}