import java.util.*;
import java.lang.*;
import java.util.function.Function;

// Function(I)
// =========
// T-> input type
// R-> return type
// public interface java.util.function.Function<T, R> {
// // 1 abstract method
// public abstract R apply(T);

//===============================================
// //default methods

// public <V> java.util.function.Function<V, R>
// compose(java.util.function.Function<? super V, ? extends T>);
// public <V> java.util.function.Function<T, V>
// andThen(java.util.function.Function<? super R, ? extends V>);
// static method
////public static <T> java.util.function.Function<T, T> identity();
//}


//=========================================================================
// class dholakpur implements Function<String,Integer>
// {
//     public Integer apply(String name)
//     {
//        return name.length();
        
//     }
// }
// class bheem
// {
//     public static void main(String[] args)
//     {
//         dholakpur dp = new dholakpur();
//         int length=dp.apply("shashank");
//         System.out.println(length);
//     }
// }

//================================================================================

class bheem{
    public static void main(String[] args)
    {
        Function<String,Integer> f = name->name.length();
        int length= f.apply("shashank");
        System.out.println(length);
    }
}