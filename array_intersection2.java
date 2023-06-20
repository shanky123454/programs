import java.util.*;
import java.lang.*;
public class array_intersection{
    public static void intersection(int[] a , int[] b, int size1,int size2)
    {
        int i,j =0;
        while((i<size1) && (j <size2))
        {
            if(a[i]== b[j])
            {
                System.out.println(a[i]);
                i++;
                j++;
            }
            else if(a[i] < b[j])
                {
                i++;
                }
                else{
                    j++;
                }
        }
    }


public static void main(String[] args) {
    System.out.println("enter the size of the first array");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int[] arr1= new int[num1];
  System.out.println("enter the elemnts of the array ");
  for(int i=0 ; i<num1; i++)
  {
      arr1[i] = sc.nextInt();
  }
  int size1 = arr1.length;
  System.out.println("elemnts of the array is ");
  for (int i=0; i<size1 ; i++) {
      System.out.println(arr1[i]);
  }
  System.out.println("enter the size of the second array");
  int num2 = sc.nextInt();
  int[] arr2= new int[num2];
  System.out.println("enter the elemnts of the array ");
  for(int i=0 ; i<num2; i++)
  {
      arr2[i] = sc.nextInt();
  }
  int size2 = arr2.length;
  System.out.println("elemnts of the second array is ");
  for (int i=0; i<size2 ; i++) {
      System.out.println(arr2[i]);
  }
  Arrays.sort(arr1);
  Arrays.sort(arr2);
  intersection(arr1,arr2,size1,size2);
}
}