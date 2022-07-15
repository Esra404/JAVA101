package generic;

import java.util.ArrayList;
import java.util.List;

public class WildCt {
    public  static  Number print(List<? extends Number> number){
        Number sum=0;
        for(Number i: number){
            sum=sum.doubleValue()+i.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args) {
        List n = new ArrayList<>();
        n.add(555);
        n.add(6.444);
        n.add(444);

        System.out.println(print(n));
        List<Double> doubles=List.of(1.2,4.5,6.733,6.5);
        System.out.println(print(doubles));

    }
}
