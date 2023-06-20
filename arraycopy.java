import java.util.*;
class arraycopy{
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        int size =arr.length;
        int[] brr = new int[size];
         brr = arr.clone();
         for (int i=0 ; i<size; i++) {
            System.out.println(brr[i]);
         }
    }
}