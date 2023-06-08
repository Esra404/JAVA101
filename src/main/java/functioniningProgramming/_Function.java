package functioniningProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        int  number=increaseByOne.apply(1);
        System.out.println(number);
        int number2=increaseByOne.andThen(multByTen).apply(2);
        System.out.println(number2);
        System.out.println(biFunction.apply(2,4));

    }
    static Function<Integer , Integer> increaseByOne=
            number-> number++;
    static  Function<Integer , Integer> multByTen= number->number*10;

    static BiFunction<Integer ,Integer, Integer> biFunction= (k, v)->
            (k++)*v;
}
