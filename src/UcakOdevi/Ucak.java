package UcakOdevi;

import java.util.Scanner;

public class Ucak {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the distance");
        int mesafi=input.nextInt();
        System.out.println("enter 1 for tek yon : 2 for gidis- donus");
        int yoluTipi=input.nextInt();
        System.out.println("enter your age");
        int yas=input.nextInt();
        double pricePerStart=0.01;
    }
}
