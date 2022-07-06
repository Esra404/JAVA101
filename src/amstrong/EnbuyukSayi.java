package amstrong;

import java.util.Scanner;

public class EnbuyukSayi {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number of numbers you wnt to test ");
        int n= in.nextInt();


       int big=0;
       int small=0;

        for(int i=1; i<=n; i++){
            System.out.println("enter a number ");
            int m=in.nextInt();
            if(i==1){
                big=m;
                small=m;
            }
            if(m>big){
                big=m;
            }
            if(m<small){
                small=m;
            }

        }
        System.out.println("big: "+ big+ " small: "+small);
    }
}
