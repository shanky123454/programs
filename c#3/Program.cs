using System;
public class c1{
public static void count(int number)
{
    var i=1;
    for(i=1; i<=number; i++)
    {
        Console.WriteLine(i);
    }
}
    public static void Main(String[] args)
    {
        int num;
        Console.WriteLine("enter the number");
        num = int.Parse(Console.ReadLine());
        count(num);
    }
}
