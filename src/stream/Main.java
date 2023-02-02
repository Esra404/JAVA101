package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main  {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);

        list.forEach(i->System.out.print(i%2));
        System.out.println();
        Stream<Integer> s1=list.stream();
//        s1.forEach(integer -> System.out.print(integer));
        System.out.println();
        Stream<Integer> s2=s1.filter(integer -> integer%2==0);
        s2.forEach(integer -> System.out.print(integer));
    }
}
