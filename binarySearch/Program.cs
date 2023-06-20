using System;
 class h{
    public static void binarySearch(int[] a, int length, int ele)
    {
        int low =0;
        int high = a.Length-1;
        int mid =0;
        while(low<=high)
        {
            mid= (low+high)/2;
            if(a[mid]== ele)
            {
                Console.WriteLine("element is present at " + " " + mid+ "index" );
                break;
            }
            else if(ele<mid)
            {
                high = mid-1;
            }
            else if(ele>mid)
            {
                low = mid+1;
            }
        }
        if(low>high)
        {
            Console.WriteLine("key is not found\n");
        }
    }
    public static void Main(String[] args)
    {
        int num;
        Console.WriteLine("enter the size of the array\n");
        num = int.Parse(Console.ReadLine());
        int [] arr = new int [num];
      Console.WriteLine(" enter the elements of the array:");
        for(int i=0;i<num;i++)
        {
            arr[i]= int.Parse(Console.ReadLine());
        }
        Console.WriteLine();
        Console.WriteLine("elements of the array is:");
        for(int i=0 ;i< arr.Length; i++)
        {
            Console.Write(arr[i]+" ");
        }
        int len = arr.Length;
        Array.Sort(arr);
        Console.WriteLine();
        for(int i=0 ;i< arr.Length; i++)
        {
            Console.Write(arr[i]+" ");
        }
        Console.WriteLine("Size of the array is:" + len);
        Console.WriteLine("enter the key to be searched\n");
        int key = int.Parse(Console.ReadLine());
        binarySearch(arr,len,key);
    }
}