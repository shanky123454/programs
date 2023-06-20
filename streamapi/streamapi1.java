import java.util.stream.*;
import java.util.*;
import java.lang.*;
// javap java.util.stream.Stream;
// javap java.util.stream.*;
class dog 
{
    public static void main(String[] args)
    {
        //Comparator c = new mycom();
        ArrayList<String> al = new ArrayList<>();
        al.add("shashank");
        al.add("ritu");
        al.add( "paglu");
        al.add("shanky");

       // System.out.println(al);
       List<String> lo = al.stream().filter(name->name.length()>4).collect(Collectors.toList());
       System.out.println(lo);

        al.stream().forEach(name->System.out.println(name));


        LinkedList<Integer> l = new LinkedList<>();
        l.add(0, 23);
        l.add(1, 5);
        l.add(2, 12);
        l.add(3, 10);
        l.add(4, 15);
        l.add(5, 20);

        //System.out.println(l);
        Integer go = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(go);

        Integer goo = l.stream().min((i1,i2)->i2.compareTo(i1)).get();
        System.out.println(goo);

        List<Integer> l2= l.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(l2);

        List<Integer> li = l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(li);
        li.forEach(System.out :: println);

        List<Integer> ll = l.stream().sorted().collect(Collectors.toList());
        System.out.println(ll);

        List<Integer> lol = l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(lol);

        Integer[] in=l.stream().toArray(Integer[] :: new);
        System.out.println(in.getClass().getName());
        for (Integer integer : in) {
            System.out.println(integer);
        }

        Object[] o = l.stream().toArray();
        System.out.println(o.getClass().getName());
        for (Object o1 : l) {
            System.out.println(o1);
        }

    }
}