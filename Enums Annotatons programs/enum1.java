enum marks{
    PASS, FAIL,NR;//>> by default it is treated as FINAL & STATIC
    // WHEN WE CALL PASS,FAIL,NR THEN INTERNALLY IT IS TREATED AS 
    // public static final marks PASS = new marks(); 
    // public static final marks FAIL = new marks(); 
    // public static final marks NR = new marks(); 

    public void help()// normal method inside enum
    {
        System.out.println("please help others");
    }
    public static int i=10;// it can have instance variable also
     marks() // it can also have constructor
    {
        System.out.println("inside constructor");
    }
    int a=0;
    public void set(int a)
    {
        this.a =a;
    }
    public int get()
    {
        return this.a;
    }
}

class pag{
    public static void main(String[] args)
    {
        marks m = marks.FAIL;
        System.out.println(m);
        marks.i=20;
        System.out.println(marks.i);
         marks[] mark= marks.PASS.values();
         for (marks marks2 : mark) {
            System.out.println(marks2.ordinal()+" "+ marks2.name());
         }
           marks.FAIL.set(10);
           int b= marks.FAIL.get();
          System.out.println(b);
    }
}