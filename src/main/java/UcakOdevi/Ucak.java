package UcakOdevi;

import java.util.Scanner;

public class Ucak {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the distance");
        int mesafe=input.nextInt();
        System.out.println("enter 1 for tek yon : 2 for gidis- donus");
        int yoluTipi=input.nextInt();
        System.out.println("enter your age");
        int yas=input.nextInt();
        if((mesafe<0||yas<0||yoluTipi==1||yoluTipi==2)){
            System.out.println("Hatalı Veri Girdiniz !");
            System.exit(0);
        }
        double pricePerStart=0.10*mesafe;
        double agepriceDiscoutn;
        if(yas<12){
            agepriceDiscoutn=pricePerStart*0.50;
            System.out.println(agepriceDiscoutn);
        }
        else if(yas<12||yas<24){
            agepriceDiscoutn=pricePerStart*0.10;

        }
        else if(yas>64){
            agepriceDiscoutn=pricePerStart*0.30;

        }else{
            agepriceDiscoutn=0;
            System.out.println(agepriceDiscoutn);
        }

     double discountPrice=pricePerStart-agepriceDiscoutn;
        System.out.println(discountPrice);
        double yoluTipiDiscount;
        if(yoluTipi==2){
            yoluTipiDiscount=0.20*discountPrice;

        } else{
            yoluTipiDiscount=0;

        }
        double totalPRICE=(discountPrice-yoluTipiDiscount)*2;
        System.out.println(" the total price to pay for your trip is :"+totalPRICE+"Tl");

    }

}
