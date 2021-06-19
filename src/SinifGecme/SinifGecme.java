package SinifGecme;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println(" enter math , science, phy rsult");
        double math=in.nextDouble();
        double science=in.nextDouble();
        double phy=in.nextDouble();
        if(math<0|| math>100|| phy<0||phy>100 || science<0||science>100){
        System.out.println("math: "+math+ "\nphy: "+phy+"\nscience: "+science+ "\t girdinz puanlari 0-100 arasinda degil");
            System.exit(0);
        }
        double average=(math+phy+science)/3;
        if(average>55){
            System.out.println(average+ "ile gectin");
        }
        else{
            System.out.println(average+ "kaldin");
        }
    }
}
