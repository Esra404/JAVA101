import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class NestedList {
    public static void main(String[] args) {
    List<List<String>> nested=new ArrayList<>();
    List<String> HEADER=List.of(
            "fIRST-NAME",
            "SECOND-Name"

    );
    nested.add(HEADER);
    List<Student> students=List.of(
            Student.builder().firstName("usman1").secondName("khalid").build(),
            Student.builder().firstName("usman2").secondName("khalid").build(),
            Student.builder().firstName("usman3").secondName("khalid").build(),
            Student.builder().firstName("usman4").secondName("khalid").build(),
            Student.builder().firstName("usman5").secondName("khalid").build(),
            Student.builder().firstName("usman6").secondName("khalid").build(),
            Student.builder().firstName("usman7").secondName("khalid").build(),
            Student.builder().firstName("usman8").secondName("khalid").build(),
            Student.builder().firstName("usman9").secondName("khalid").build(),
            Student.builder().firstName("usman10").secondName("khalid").build()
    );

        for (Student student:students) {
            List<String> data=List.of(
                    student.firstName,
                    student.secondName
            );
            nested.add(data);
        }

        System.out.println(nested);
    }
}

@Data
@Builder
class Student{
    String firstName;
    String secondName;
}