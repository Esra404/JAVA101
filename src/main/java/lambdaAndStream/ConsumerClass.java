package lambdaAndStream;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerClass {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>() ;
        list.add(5);
        list.add(67);
        list.add(89);
        list.add(5);
        list.add(5);
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("INTEGER: " +integer + " Square: "+Math.pow(integer,2));
            }
        });
list.forEach(integer -> System.out.println("INTEGER: " +integer + " Square: "+Math.pow(integer,3)));
list.removeIf(integer -> integer==5);
        for (Integer i:list
             ) {
            System.out.println(i);
        }
    }
}
