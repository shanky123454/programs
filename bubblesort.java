import java.util.*;
class hfg{
 public  void bubble(int[] b, int size)
{
        for(int i=0; i<size-1; i++)
        {
          for(int j=i+1; j<size;j++)
          {
            if(b[i]>b[j])
            {
              int temp;
              temp=b[i];
              b[i] =b[j];
              b[j]=temp;
            }
            else{

            }
          }
        }
        for(int i=0; i<size;i++)
    {
      System.out.println(b[i]);
    }
}
/*public void swap(int a, int b)
{
  int temp;
  temp=a;
  a =b;
  b=temp;
}*/
}
class gfg{
  public static void main(String[] args) {  
    System.out.println("enter the number of elements in an array\n");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] a = new int[num];
    System.out.println("enter the elemrnts of the array\n");
    for(int i=0; i<num; i++)
    {
      a[i] = sc.nextInt();
    }
    System.out.println();
    System.out.println("elemnts of the array are\n");
    for(int  i=0; i<a.length;i++)
    {
      System.out.println(a[i]);
    }
    int size= a.length;
    System.out.println(size);
    hfg h1 = new hfg();
    h1.bubble(a,size);
    
  }
}
