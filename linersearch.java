import java.util.*;
 class s2{
    public static boolean linearSearch(int[] arr1, int length,int ele)
    {
        for(int i=0 ; i< length; i++)
        {
            if(arr1[i]==ele)
            {
                return true;
            }
           
        }
        return false;
    }
    public static void main(String[] args){
    System.out.println("enter the number of elements in array\n");
    int num;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    int [] arr = new int[num];
    System.out.println("enter the elements of the array\n");
    for(int i=0; i<num; i++)
    {
        Scanner sc1 = new Scanner(System.in);
        arr[i]= sc1.nextInt();
    }
    System.out.println("printing the elements of the array\n");
    for(int i=0; i<arr.length; i++)
    {
        System.out.println(arr[i]);
    }
    int len = arr.length;
    System.out.println("Enter the element to be searched\n");
    Scanner sc2 = new Scanner(System.in);
    int key = sc2.nextInt();
     boolean b1 =linearSearch(arr,len,key);
     if(b1==true)
     {
        System.out.println("key is present\n");
     }
     else
     System.out.println("key is not present\n");
    }
}