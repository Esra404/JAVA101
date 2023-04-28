package assigment;

import java.util.*;

public class merve {
  Random randnum;

    public static void main(String[] args) {
//        int []dizi={1,4,5,2,3,8,9,6};
//        soru2(dizi);

        soru1();
    }

    public static void soru2(int dizi[]) {
        Arrays.sort(dizi);
        int cevap = 0, say = 0;
        List<Integer> yeniDizi = new ArrayList<>();
        yeniDizi.add(dizi[0]);
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] != dizi[i - 1])
                yeniDizi.add(dizi[i]);
        }



        for (int i = 0; i < yeniDizi.size(); i++) {
            if (i > 0 && yeniDizi.get(i) == yeniDizi.get(i - 1) + 1){
                say++;
            }
            else{
                say = 1;
            }
            cevap = Math.max(cevap, say);
        }
        System.out.println(cevap);

    }
    public static   void soru1(){

        double dizi1[]=random();
        double dizi2[]=random();

        System.out.println(Arrays.toString(dizi1)+"islem baslamdan dizi1");
        System.out.println(Arrays.toString(dizi2)+"islem baslamdan dizi2");
     for(int i=0; i<dizi1.length; i++){
         for (int j=0; j<dizi2.length; j++){
             if(dizi1[i]==dizi2[j]){
                 dizi1[i]=0;
                 continue;
             }
         }
     }

        System.out.println(Arrays.toString(dizi1)+"islem esitlik bittnce dizi1");

    double ort=Arrays.stream(dizi1).average().getAsDouble();
        System.out.println(ort);

        for(int i=0; i<dizi1.length; i++){
          if(dizi1[i]==0){
              dizi1[i]=ort;
          }
        }
        double ort2=Arrays.stream(dizi1).average().getAsDouble();
        System.out.println(ort2);

        for(int i=0; i<dizi2.length; i++){
            if(dizi2[i]==0){
                dizi2[i]*=ort2;
            }
        }

        System.out.println(Arrays.toString(dizi1)+"islem bitince dizi1");
        System.out.println(Arrays.toString(dizi2)+"islem bitince dizi2");
    }

    public static double [] random(){

       Random rd = new Random();
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10);

        }
        return arr;
    }
}
