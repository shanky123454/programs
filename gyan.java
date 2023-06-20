import java.util.*;
import java.lang.*;
  class h{
    public  void m1(int[]... x)
    {
        System.out.print(x);
        System.out.println();
        for (int[] is : x) {
            //System.out.println(is);
            System.out.println(is);
            //System.out.println();
        for (int is1 : is) {
            System.out.println(is1 + " ");
        }
    }
    System.out.println();
       /*int sum=0;
       for (int i : x) {
        sum = sum+i;
       }
       System.out.println(sum);*/
    }
  }
  class g
  {public static void main(String[] args)
    {
      int[] x={1,2,3};
      int[] y={7,8,9};
      h h1 =new h();
     // h1.m1();
     // h1.m1(2,3);
     // h1.m1(new int[]{1,2,3,});
      h1.m1(x,y);
     char a ='b';
     int c =a;
     System.out.println(c);
     float s =100.01f;
     char g = (char)s;
     System.out.println(g);
    
    }
  }

    
     
 