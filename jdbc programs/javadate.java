
class hoola
{
    public static void main(String[]args)
    {
        java.util.Date date = new java.util.Date();
        System.out.println("current date is:" + date);

        System.out.println();

         long l = date.getTime();
         System.out.println(l);
         System.out.println();

         java.sql.Date d1 = new java.sql.Date(l);
        
         System.out.println("curren date is:" + d1);

        
          

    }
}