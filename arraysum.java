import java.util.*;
class s1{
    public static void sum(int[] arr1, int length)
    {
        int sum=0;
        for(int i=0 ;i<length;i++)
        {
            sum= sum+ arr1[i];
        }
        System.out.println("array sum is:" + sum);

    }
    public static void main(String[] args)
    {
        int num;
        System.out.println("enter the size of the array\n");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("enter the elements of the array\n");
        for(int i=0; i<num;i++)
        {
            //Scanner sc1 = new Scanner(System.in);
             arr[i] = sc.nextInt();
        }
        System.out.println("printing array elements\n");
        for(int ele: arr)
        {
            System.out.println(ele);
        }
        int length = arr.length;
        System.out.println("Array length is:"+ length);

        sum(arr,length);

    }
}