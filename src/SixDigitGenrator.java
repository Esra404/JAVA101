import java.text.DecimalFormat;
import java.util.Random;

public class SixDigitGenrator {


    public static void main(String[] args) {
        System.out.println(new SixDigitGenrator().generateNumber());

    }

    public  String generateNumber(){
        return new DecimalFormat("000000")
                .format(new Random().nextInt(999999));
    }


}
