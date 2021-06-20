import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int total=0;
        Scanner in= new Scanner(System.in);
        System.out.println("enter a number");
        int number= in.nextInt();
        for(int i=1; i<=number/2; i++){
            if(number%1==0){
                total=total+i;
            }
        }
        if(total==number){
            System.out.println(number+ " mukemmeldir");
        }
        else
            System.out.println(number+ " mukemmel degildir");
    }
}
