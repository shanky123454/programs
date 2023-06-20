import java.util.*;
public class frequency{
    public static void frequencycount(int[] a, int size)
    {
        int[] b = new int[size];
        b=a.clone();
        int visited=-1;
        int i;
       // int count=1;
        for( i=0; i<size;i++)
        {
             int count=1;
            for(int j =i+1; j<size;j++)
            {
                if(b[i]== b[j])
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
        for(int k=0; k< b.length; k++)
        {
            if(b[k]!=visited)
            System.out.println("count of the element at index:"+ k+ "is"  + b[k]);
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
        frequencycount(a,size);
    }
}