import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class numberCompact {
    public static void main(String[] args) throws ParseException {
//        NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.CANADA, NumberFormat.Style.SHORT);
//        System.out.println(fmt.format(1000));
//        System.out.println( fmt.format(10000) );
//        System.out.println( fmt.format(10012) );
//        System.out.println( fmt.format(100201) );
//        System.out.println( fmt.format(1111111) );
//
//
//
//        NumberFormat fmt1 = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
//        fmt1.setMinimumFractionDigits(3);
//
//        System.out.println( fmt1.format(10000) );
//        System.out.println( fmt1.format(10012) );
//        System.out.println( fmt1.format(100001) );
//        System.out.println( fmt1.format(1111111) );
//
//        NumberFormat fmt2= NumberFormat.getCompactNumberInstance(new Locale("hi", "IN"), NumberFormat.Style.SHORT);
//        System.out.println(fmt2.format(1000000));

        NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);

        System.out.println( fmt.parse("100") );
        System.out.println( fmt.parse("2 thousand") );
        System.out.println( fmt.parse("10 thousand") );
        System.out.println( fmt.parse("100 thousand") );
        System.out.println(Locale.getDefault());
    }
}
