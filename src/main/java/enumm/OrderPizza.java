package enumm;

import java.util.EnumSet;

public enum OrderPizza {


    ORDERED(1),
    READY(2),
    DELIVERED(3);
    private int lever;

    OrderPizza(int lever){
        this.lever=lever;
    }

    private   int getLever(){
        return this.lever+34;
    }

    public static void main(String[] args) {
//        System.out.println(OrderPizza.ORDERED);
//
//        for(OrderPizza o: OrderPizza.values()){
//            System.out.println(o.getLever());
//            }

        EnumSet<OrderPizza> orderPizzaEnumSet= EnumSet.allOf(OrderPizza.class);

        orderPizzaEnumSet.stream()
                .forEach(System.out::println);

        System.out.println("Enum: "+orderPizzaEnumSet);

        System.out.println(" contain "+ orderPizzaEnumSet.contains(OrderPizza.ORDERED));




    }
}
