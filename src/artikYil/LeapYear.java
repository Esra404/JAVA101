package artikYil;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the year");
        int year=in.nextInt();
        if(year%4==0|| year%100==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year+ " bir artık yıldır !");
                    System.exit(0);

                }
                else{
                    System.out.println(year+ " bir artık yıldır değildir !");
                }

            }
            System.out.println(year+ " bir artık yıldır !");
        }
        else{
            System.out.println(year+ " bir artık yıldır değildir !");
        }
    }
}
