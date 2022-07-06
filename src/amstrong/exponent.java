package amstrong;

import java.util.Scanner;

public class exponent {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        int  b=in.nextInt();
        if(b==0||a==0){
            System.out.println(0);
            System.exit(0);
        }
        System.out.println(expo(a,b ));
    }
    public static int expo(int a,int b){


        if(b<1){
            return 1;

        }
        else
            return a* expo(a,b-1);


    }
}
