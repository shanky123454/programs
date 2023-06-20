import java.util.*;
public class lovebabbar{
    public static void unique(int[] a, int size)
    {
        int[] b = new int[size];
        b=a.clone();
        int ans=0;
        int visited =-1;
        int count=1;
        for(int i=0; i<b.length;i++)
        {
             count=1;
            for(int j=i+1;j<b.length;j++)
            {
                if(b[i]==b[j])
                {
                    b[j]=visited;
                    count++;
                    if(count>1)
                    {
                        b[i]=visited;
                    }
                }
            }
        }
        for(int k=0; k<b.length;k++)
        {
            if(b[k]!=visited)
            {
                System.out.println("unique element is:" + b[k]);

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
        unique(a,size);
    }
}