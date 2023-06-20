import java.util.*;
public class duplicate{
    public static void frequencycount(int[] a, int size)
    {
        int[] b = new int[size];
        b=a.clone();
        int ans=0;
        int flag =0;
        for(int i=0; i<b.length;i++)
        {
            for(int j=i+1; j<b.length; j++)
            {
                if ((b[i]^b[j])==0)
                {
                    flag=1;
                    System.out.println("duplicate element is:" + b[i]);
                }
            }
        } 
        if(flag==0)
        System.out.println("no duplicates are present");
 
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
        frequencycount(a,size);
    }
}