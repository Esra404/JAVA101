package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<Integer> name= new ArrayList<>();
        name.add(1);
        name.add(1);
        name.add(1);
        name.add(1);
        List<String> name1= new ArrayList<>();
        name1.add("ff");
        name1.add("gdsfg");
        name1.add("sgs");
        name1.add("sgsa");
        print(name);
        print(name1);

    }
    public static void print(List<?> tList){
         for(int i=0; i<tList.size(); i++){
             System.out.println(tList.get(i));
         }

    }
}
