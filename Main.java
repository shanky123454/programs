
 class Test {
public static void main(String[] args) throws Exception{
    Test t = new Test() ;
     //System.out.println(p instanceof Thread);//C.E
       System.out.println(t instanceof Object);//true
       System.out.println(t instanceof Test);//true
       System.out.println(Class.forName(args[0]).isInstance(t));

}
}
        