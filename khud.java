import java.util.*;
public class khud{
    public static void main(String[] args)
    {
       // int[][] arr = new int[][]{{1,2},{3,4}};
       int [][][] arr = new int[][][]{new int[][] {{1,2}}, new int[][] {{3,4}},new int[][] {{5,6}}};
      // Arrays.equals(null, null);
     //  Arrays.deepEquals(args, arr);
      //int [][] arr = {new int[] {1,2}, new int[] {3,4}};
     // int[][] arr = {{1,2},{3,4}};
      // Custom input array
      //int a[] = { 1, 8, 3 };
      // Creating an array b[] of same size as a[]
     // int b[] = new int[a.length];
      // Copying elements of a[] to b[]
     //System.arraycopy(a, 0, b, 0, 3);
     //int b[] = Arrays.copyOf(a, 3);
    // int b[] = a.clone();

        for (int[][] is : arr) {
            System.out.println(is);
            for (int[] is2 : is) {
                System.out.println(is2);
                for (int is3 : is2) {
                    System.out.println(is3);
                }
            }
        }
    }
}