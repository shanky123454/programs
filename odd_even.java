import java.util.*;
import java.lang.*;
public class odd_even{
            public static void find(int[] b ,int size)
            {
                System.out.println("even no in array are:");
                for(int i=0; i<size;i++)
                {
                    if(b[i]% 2==0)
                    {
                        System.out.println(b[i]);
                    }
                }
                        System.out.println("odd no in array are:");
                        for(int i=0; i<size;i++)
                        {
                            if(b[i]% 2!=0)
                            {
                                System.out.println(b[i]);
                            }
                        }
            }
public static void main(String[] args)
{
   // int[] a = new int[]{1,2,3,4};
   System.out.println("enter the size of the array");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int[] a= new int[num];
    System.out.println("enter the elemnts of the array ");
    for(int i=0 ; i<num; i++)
    {
        a[i] = sc.nextInt();
    }
    int size = a.length;
    System.out.println("elemnts of the array is ");
    for (int i=0; i<size ; i++) {
        System.out.println(a[i]);
    }
    find(a,size);
  }
}