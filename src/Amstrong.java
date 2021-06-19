import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        String M=number+"";
        System.out.println(M);
        for(int i=0; i<M.length(); i++){
            char m=M.charAt(i);
            int mm=(int)m;
            System.out.print(" +" +m);
        }
    }
}