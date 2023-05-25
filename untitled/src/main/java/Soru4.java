import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Soru4 {

    public static void main(String[] args) {
        File gerisDoysay = null;
        Scanner scanner = null;
        PrintStream tekAsaldoya = null;

        try {
            gerisDoysay = new File("Ali.txt");
            scanner = new Scanner(gerisDoysay );
            tekAsaldoya = new PrintStream("ASAL.txt");
//        daosya tek tek oku
            while (scanner.hasNext()) {
                int number = scanner.nextInt();
//                asal metoduna git
                if (isPrime(number))
//                    dosyaya yazdirma eger asal ise
                    tekAsaldoya.println(number);
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("dosya yok");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (tekAsaldoya != null) {
                tekAsaldoya.close();
            }
        }

    }


//    asal mi
    private static boolean isPrime(int n) {
        int bolunen = 2;
        boolean asal = true;
        while (asal && (bolunen <= (int) Math.sqrt(n))) {
            if (n % bolunen == 0) {
                asal = false;
            }
            bolunen++;
        }
        return asal;
    }
}
