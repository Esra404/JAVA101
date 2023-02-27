package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapping {
    public static void main(String[] args) {
        HashMap<Integer ,String> student=new HashMap<>();
        student.put(1,"usman");
        student.put(2,"usman1");
        student.put(3,"usman1");
        student.put(4,"usman1");
        HashMap<Integer ,String> student1=new HashMap<>(Map.of(1,"usman",2,"come"));
        System.out.println(student);
        System.out.println(student1.get(1));

        student.putAll(student1);
        System.out.println(student);
        Collection<String> stu=student.values();
          stu.forEach(v->System.out.println(v));

          for(Integer entry: student.keySet()){
              System.out.println(student.get(entry));

        }



    }
}
