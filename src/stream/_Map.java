package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class _Map {
    public static void main(String[] args) {
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

        for(Integer integer:integerList){
            System.out.println(integer);
        }
        System.out.println("MAP AND FILTER.........");

        integerList.stream()
                .map(m->m*2)
                .filter(m->m%2==0)
                .forEach(System.out::println);

        List<Person> people=new ArrayList<>(
              List.of(
                      new Person("usman", "khalid",16),
                      new Person("usman", "khalid",17),
                      new Person("usman", "khalid",15),
                      new Person("usman", "khalid",18),
                      new Person("usman", "khalid",56),
                      new Person("usman", "khalid",24),
                      new Person("usman", "khalid",20)

              )
        );


        List<Person> personList=people.stream()
                .filter(person->person.getAge()>=18)

                .collect(Collectors.toList())
               ;
        personList .forEach(person -> person.setAccess(true));
        for (Person p:personList) {
            System.out.println(p.toString());

        }
        System.out.println("flatmaping");
   _FlatMap.start();

    }




}

class _FlatMap{

    public  static  void start(){
        List<Integer> list=List.of(1,2,3,4);
        List<Integer> list1=List.of(1,2,3,4);
        List<Integer> list2=List.of(1,2,3,4);
        List<Integer> list3=List.of(1,2,3,4);
        List<List<Integer>> lists=List.of(list1,list2,list3,list);

        lists.stream()
                .flatMap(m->m.stream()
                        .map(x->x*x))
                .collect(Collectors.toList())
                .forEach(System.out::print);

    }
}

class  Person{
    private String fName;
    private String sName;
    private int age;
    private boolean access;
    public Person(String fName, String sName, int age) {
        this.fName = fName;
        this.sName = sName;
        this.age = age;
    }

    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", sName='" + sName + '\'' +
                ", age=" + age +
                ", access=" + access +
                '}';
    }
}
