package collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListClass {

    public static void main(String[] args) {
        ArrayList<String> i = new ArrayList<>();
        i.add("usman55");
        i.add("uaman4");
        i.add("usman3");
        i.add("usman2");i.add("usman1");

        System.out.println(i.removeIf(ii->ii=="usman1"));
        i.forEach(System.out::println);

        i.retainAll(i);
        System.out.println("----------------------- sorting");
        Collections.sort(i);
        for(String i1: i){
            System.out.println(i1);
        }

        i.sort(Comparator.reverseOrder());
        Comparator<String> mysort=Comparator.comparingInt(String::length);

        Comparator<String> comparator=(S1,S2)->Integer.compare(S1.length(),S2.length());
        i.sort(mysort);
        System.out.println(i);
        i.sort(Comparator.comparingInt(String::length));
        System.out.println(i);
        i.sort(Comparator.comparingInt(s -> s.charAt(1)));

        System.out.println(i);

        System.out.println(i);
        System.out.println("----------------");
        Integer myInt[]={1,2,3,4,5,6,7,9};
        ArrayList<Integer> integers= new ArrayList<>(Arrays.asList(myInt));

        System.out.println(integers);


    }
}
