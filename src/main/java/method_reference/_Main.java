package method_reference;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _Main {

    public  void m1(){
        System.out.println("this is M1");
    }
    public  void m2(){
        System.out.println("this is M2");
    }



    public static void main(String[] args) {
       List<Employee> employees= getEmployee();
//       COMSUMER
        employees.stream()
                .forEach(new Consumer<Employee>() {
                    @Override
                    public void accept(Employee employee) {
                        System.out.println(employee);
                    }
                });
        System.out.println(".................................");
// METHOD REFRENCE
        employees.stream()
                .forEach(_Main::print);
        System.out.println(".................................");

//        SOUT
        employees.stream()
                .forEach(System.out::println);
        System.out.println(".................................");
Employee e=new Employee();
        employees.stream()
                .map(Employee::getFirstName)
                .forEach(System.out::println);
    }

    public  static void print(Employee employee){
        System.out.println(employee.toString());

    }

    public  static List<Employee> getEmployee(){
       return IntStream.range(0,10)
                .mapToObj(
                     i->   new Employee(i, "epl"+i,"empl"+i,
                             "email"+i,123+i,"E"+i)
                ).collect(Collectors.toList());
    }
}
