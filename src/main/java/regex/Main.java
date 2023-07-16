package regex;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        String name="usman ";
//        System.out.println(name.repeat(3));
//        System.out.println(firstRegx());
//        System.out.println(firstRegxSimple());
//        all();
        string();
    }


    static boolean  firstRegx(){
        Pattern p = Pattern.compile(".s");//. represents single character
        Matcher m = p.matcher("usaS");
        return m.matches();
    }

    static  boolean firstRegxSimple(){
        return  Pattern.compile(".s").matcher("is").matches();
    }

    static void  all(){
        System.out.println(Pattern.matches("[abc]","ab"));
        System.out.println("\n");
        System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)
        System.out.println(Pattern.matches("[^amn]", "a"));//true (among a or m or n)
        System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)
    }

    static  void  string(){
        System.out.println("usman ".repeat(2));
        System.out.println(" ".isBlank());
        System.out.println("".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println("  usman khalid  ".stripLeading());
        System.out.println("  usman khalid  ".stripIndent());
        System.out.println("  usman khalid  ".stripTrailing());
        System.out.println("  usman khalid  ".strip());

        System.out.println("  Asman khalid  ".codePointAt(2));

        "usman khalid".lines().forEach(System.out::println);

    }
}
