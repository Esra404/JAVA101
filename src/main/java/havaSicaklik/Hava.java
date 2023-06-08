package havaSicaklik;

import java.util.Arrays;
import java.util.Scanner;

public class Hava {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("hava derece giren");
        int check= in.nextInt();
        if(check<5){
            System.out.println("kayrak");
        }
        else if(check<5||check<15){
            System.out.println("sinema");
        }
        else if(check<10||check<25){
            System.out.println("piknk");
        }
        else
            System.out.println("yuzme");
    }
}
