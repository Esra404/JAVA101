package stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main  {
    public static void main(String[] args) {
//        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
//
//        list.forEach(i->System.out.print(i%2));
//        System.out.println();
//        Stream<Integer> s1=list.stream();
////        s1.forEach(integer -> System.out.print(integer));
//        System.out.println();
//        Stream<Integer> s2=s1.filter(integer -> integer%2==0);
//        s2.forEach(integer -> System.out.print(integer));

        List<Person> people=new ArrayList<>(List.of(
                new Person("USMAN", Gender.FEMALE),
                new Person("USMAN1", Gender.FEMALE),
                new Person("USMAN2", Gender.MALE),
                new Person("USMAN3", Gender.FEMALE),
                new Person("USMAN4", Gender.MALE)


        ));
        System.out.println(people);

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }


    static  class  Person{
        String name;
     Gender gender;
     Person(String name, Gender gender){
         this.name=name;
         this.gender=gender;

        }
    }
}

 enum  Gender{
    MALE, FEMALE
}
