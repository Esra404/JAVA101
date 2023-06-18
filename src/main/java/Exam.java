import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("kac tane satir olacak girin");



        int satir = input.nextInt();

//        ilk dongu
        for (int i = 0; i < satir; i++) {

//            icilik dongu
            for (int j = 0; j <= i; j++) {
//                cift satir  00 ile   basla
                if ((i + j) % 2 == 0) {
                    System.out.print("00");
                }
//                tek satirda cift ile basla
                else {
                    System.out.print("11");
                }
            }
//          yeni satir gec
            System.out.println(); // Move to the next line
        }
    }
}
