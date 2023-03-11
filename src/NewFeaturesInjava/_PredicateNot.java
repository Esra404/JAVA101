package NewFeaturesInjava;

import java.util.List;

import java.util.function.Predicate;

public class _PredicateNot {
    public  static   boolean isEven(Integer num){
 return  num%2==0;
    }
    public static void main(String[] args) {
        List<Integer> integers=List.of(1,2,3,4,5,6,7,6,3,23,32412,23,1,32);

        Predicate<Integer> predicateFunction= number-> number %2==0;

        integers.stream().filter(predicateFunction)
                .forEach(System.out::println);


//        method reference
        System.out.println("////////////////////////");
        integers.parallelStream()
                .filter( _PredicateNot::isEven)
                .forEach(System.out::print);

    }
}
