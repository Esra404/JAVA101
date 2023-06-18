public class Exams2 {
    public static void main(String[] args) {

        String[] names = {"Arzu", "Alev", "Asli", "Azra", "Elif"};
        int boyut = names.length;

//Upper loop
        for (int i = 1, x = 0; i <= boyut; i++, x++) {
            for (int j = boyut; j >= i; j--) {
                System.out.print(" ");
            }
            String isim = names[x];
            System.out.print(isim);
            for (int j = 1; j <= (i - 1) * 2; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println();
            } else {
                System.out.print(isim + "\n");
            }
        }

// Lower loop
        for (int i = boyut - 1, m = 0; i >= 1; i--, m++) {
            for (int j = boyut; j >= i; j--) {
                System.out.print(" ");
            }
            String ikinIsim = names[m];
            System.out.print(ikinIsim);
            for (int j = 1; j <= (i - 1) * 2; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println();
            } else {
                System.out.print(ikinIsim + "\n");
            }
        }
    }
}