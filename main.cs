using System;
public class cs{
  public static void Main(String[] args)
  {
    int num=0;
    Console.WriteLine("enter the number");
   num =int.Parse(Console.ReadLine());
   int i=1;
   char a ='A';
   while(i<=num)
   {
    int j=1;
    char b =a;
    while(j<=i)
    {
    
        Console.Write(b+ " ");
        b++;
        j++;
    }
    Console.WriteLine();
    i++;
    a++;
    
   }
  }
}

