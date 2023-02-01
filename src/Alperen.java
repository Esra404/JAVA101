import java.util.ArrayList;
import java.util.List;

public class Alperen {
    public static void main(String[] args) {
        int [][]A={
            {1,2,3,4},
            {4,45,5}
        };
    Integer []m=donus(A);
    for (Integer i: m){
        System.out.println(i);
    }
    }



    public  static  Integer[] donus(int array2[][]){
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array2.length; i++) {

            for (int j = 0; j < array2[i].length; j++) {

                list.add(array2[i][j]);
            }
        }
        Integer[] array = list.toArray(new Integer[0]);
        return  array;
    }
}
