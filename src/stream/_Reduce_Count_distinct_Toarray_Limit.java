package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class _Reduce_Count_distinct_Toarray_Limit {
    public static void main(String[] args) {
//   _Distinct_Limit.start();
//        _Distinct_Limit.limit();
//        _reduce.start();
        _sorted.start();
    }
}


class  _Distinct_Limit{

    public static   void start(){
        System.out.println("Distinct------------------->");
        List<String> list=List.of("CAR","ARABA","HOME");
        list.stream().distinct()
                .forEach(System.out::println);

    }


    public  static  void limit(){
        System.out.println("limit------------------>");
        List<Integer> integerList= new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);
        integerList.add(11);

        integerList.stream().limit(5).collect(Collectors.toList())
                .stream().map(m->m*3).collect(Collectors.toList())
                .forEach(System.out::println);

    }
}

class  _reduce{

    public  static  void start(){
        System.out.println("reduce-------------->");
        List<Integer> integerList= new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);
        integerList.add(11);

        Optional<Integer> optionalInteger=integerList.stream()
                .reduce(0,Integer::sum).describeConstable();
        System.out.println(optionalInteger.get());
    }
}

class _sorted{
    public  static  void start(){
       List<Integer> integerList= new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(52);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);
        integerList.add(11);
        List<String> strings=List.of("usman","Khalida","kalid");

        integerList.stream().sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        strings.stream()
                .map(m->m.charAt(m.length()-1))
                .sorted()
                .forEach(System.out::println);

    }

}