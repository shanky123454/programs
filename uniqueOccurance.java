import java.util.*;
import java.lang.*;
public class uniqueOccurance{
    public static boolean unique(int[] a, int size)
    {
        int[] b = new int[size];
        b=a.clone();
        int ans=0;
        int visited =-98765;
        int count=1;
        int flag=0;
        for(int i=0; i<b.length;i++)
        {
             count=1;
            for(int j=i+1;j<b.length;j++)
            {
                if(b[i]==b[j])
                {
                    b[j]=visited;
                    count++;
                }
            }
            if(b[i]!=visited)
            {
                b[i]=count;
            }
        }
        outerloop:
        for(int k=0; k<b.length; k++)
        {
            for(int l= k+1;l<b.length;l++)
            {
                 if((b[k]!=visited) && (b[l]!=visited))
                 {
                    if((b[k]^b[l])==0)
                    {
                        flag=1;
                        break outerloop;

                    }
                    else{
                        flag=0;
                    }
                }
           }
        }
        if(flag==1)
        {
            return false;
        }
        return true;
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
        boolean x =unique(a,size);
        System.out.println(x);
    }
}