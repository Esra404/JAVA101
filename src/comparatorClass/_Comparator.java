package comparatorClass;

import java.util.Comparator;
import java.util.List;


public class _Comparator {
    public static void main(String[] args) {
        var student= new Student("usman", "khalid", 12);
        var student1= new Student("usman", "khalidM", 15);
        var student2= new Student("usman", "khalid", 15);



        List<Student> studentList=List.of(student1,student2,student);


        studentList.stream()
                .sorted(Comparator.comparing(Student::age).thenComparing(Student::firstName).reversed())
                .forEach(System.out::println);

    }
}
