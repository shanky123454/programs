import java.util.*;
import java.lang.*;
class My implements Comparator
{
        public int compare(Object obj1, Object obj2)
        {
            Integer i1= (Integer)obj1;
            Integer i2= (Integer)obj2;
        //    if(i1>i2)                               
        //    return -1;
        //    else if(i1<i2)
        //    return +1;
        //    else
        //    return 0;

        //========================================================
        //return i1.compareTo(i2); // 0,5,10,12,15,20
        //  return i2.compareTo(i1);//20,15,12,10,5,0
        // return +1;//12,15,20,5,0,10
        // return -1;// 10,0,5,20,15,12
        // return 0;//12
       // return -i1.compareTo(i2);//20,15,12,10,5,0
        return -i2.compareTo(i1);//0,5,10,12,15,20

        }
}
class Comparatortyui 
{
    public static void main(String[] args)
    {
    TreeSet st = new TreeSet<>(new My()); // line-1
    st.add(12);
    st.add(15);
    st.add(20);
    st.add(5);
    st.add(0);
    st.add(10);

    System.out.println(st);//natural sorting order in ascending order
    }
}
