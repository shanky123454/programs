using System;
public class j1{
public static void moo(int num)
{
    bool b = false;
    for (int i=2; i<num-1; i++)
    {
        if(num%i==0)
        {
            b=true;
            break;
        }
    }
  if(b==true)
  {
    Console.WriteLine("number is not prime\n");
  }
   else{
    Console.WriteLine("number is prime \n");
   }
}
public static void Main(String[] args) {
    Console.WriteLine("enter the number\n");
    int number=0;
    number =int.Parse(Console.ReadLine());
    moo(number);    
}
}
