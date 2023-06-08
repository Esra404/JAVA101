package assigment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int diziboyut;
        System.out.println("DIZININ BOYUDU GIRIN: ");
        diziboyut=input.nextInt();
        int dizi[]= new int[diziboyut];

        System.out.println("dizi doldurun: ");
        for (int i=0; i<dizi.length; i++){
            System.out.println("bir sayac girin");
            dizi[i]=input.nextInt();
        }



        for (int i=0; i<dizi.length; i++){
            System.out.print(dizi[i]+" ");
        }
        System.out.println();



        List<Integer> yenidzi= new ArrayList();
        for (int i=0; i<dizi.length; i++){

               if(i%2==0){
                   System.out.print(dizi[i]+" ");
                   yenidzi.add(dizi[i]);


               }

        }

        List<Integer> sondzi= new ArrayList();

        for (int i = 0; i + 1 < yenidzi.size(); i++)
        {
            int sum = 0;
            sum=yenidzi.get(i)+yenidzi.get(i+1);
            sondzi.add(sum);
            i++;
        }
        System.out.println(" son hali");
        System.out.println(sondzi.toString());

    }
}
