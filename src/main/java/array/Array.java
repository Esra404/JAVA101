package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("DIZI BOYUTU GIRIN");
        int boyutu=new Scanner(System.in).nextInt();
        int dizi[]=rasgeleSayi(boyutu);

        Arrays.stream(dizi).forEach(System.out::println);
    }

    public  static  int []  rasgeleSayi(int boyut){
        int [] dizi= new int[boyut];
         Random random= new Random();

       for(int i=0; i< dizi.length; i++){
           dizi[i]= random.nextInt(10,100);
       }

        return dizi;
    }
}
