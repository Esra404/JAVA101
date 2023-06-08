package NewFeaturesInjava;

import java.util.ArrayList;
import java.util.List;

public class _CopyOF {

    public static void main(String[] args) {
   List<String> list =new ArrayList<>();
   list.add("usman");
   list.add("khalid");
   List<String> list1=cantChange(list);

        System.out.println(list1);
        try {
            list1.add("yes");
        }catch (Exception ex){
            System.out.println("Error");
        }

    }

    private  static  List  cantChange(List list){
        List list1=List.copyOf(list);
        return list1;
    }
}
