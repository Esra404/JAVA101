package functioniningProgramming;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(".com".endsWith(".com"));
        System.out.println(phone("+905550754423"));
        System.out.println( predicate.test("+905550754423"));
    }

    public static   boolean phone(String string){
        return ( string.startsWith("+90")&& string.length()==12);
    }

    static Predicate<String> predicate=string-> ( string.startsWith("+90")&& string.length()==12);
}
