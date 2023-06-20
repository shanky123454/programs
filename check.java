
public class check{
    public static void main(String[] args)
    {
        Object o1 = new Object();
        System.out.println(o1 instanceof String);//===> false==> parent instanceof child relation is always false
        Object o2 = new Thread();
        System.out.println(o2 instanceof Object );// true
        String s = null;
        System.out.println(s);
        System.out.println(s instanceof Object);// false ==> null instanceof class/interface is always false
        Object ob3 = null;
        System.out.println(ob3 instanceof String);//false
      //  Thread o = new Object();
       // System.out.println(o instanceof String);// compilation error
    }


}

// =========================================================================
// To use instanceof operator compulsory there should be some relation between
// argument types
// (either child to parent Or parent to child Or same type) Otherwise we will
// get compile time error saying inconvertible types.

// eg: String s= new String("sachin");
// System.out.println(s instanceof Thread);//CE
// Thread t=new Thread( );
// System.out.println(t instanceof String);//CE
// => Whenever we are checking the parent object is child type or not by using
// instanceof operator that we get false.
// Object o=new Object( );
// System.out.println(o instanceof String ); //false
// Object o=new String("ashok");

// System.out.println(o instanceof String); //true
// => For any class or interface X null instanceof X is always returns false
// System.out.println(null instanceof X); //false
// public class Test {
// public static void main(String[] args) {
// Object t = new Thread();
// System.out.println(t instanceof Object);//true
// System.out.println(t instanceof Thread);//true
// System.out.println(t instanceof Runnable);//true
// System.out.println(t instanceof String);//false
// System.out.println(null instanceof Object);//false
// }
// }