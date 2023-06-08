package NewFeaturesInjava;

import java.util.List;
import java.util.function.Predicate;

//class  The_best_lan{
//     static   boolean getTheBest(String lan){
//        return !(lan.equalsIgnoreCase("java")
//                || lan.equalsIgnoreCase("QURAN"));
//    }
//}
public class Main {
     public static void main(String[] args) {
        var language= List.of("java","python",
                                   "c","javascript","Quran");
        language.stream()
                .filter(Predicate.not(Main::getTheBest))
                .forEach(System.out::println);
 }
    static   boolean getTheBest(String lan){
        return !(lan.equalsIgnoreCase("java")
                || lan.equalsIgnoreCase("QURAN"));
    }
}
