import java.util.Scanner;

public class HesapMakina {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("MY FIRST CALCULATOR");
        System.out.println("ENTER FIRST NUMBER ");
        int first= in.nextInt();
        System.out.println("ENTER SECOND NUMBER ");
        int second= in.nextInt();
        System.out.println(" ENTER \n + ADDITON \n / division \n x multiplication ");
        char c=in.next().charAt(0);
        switch (c){
            case '+':
                System.out.println("addition: "+ first+ " + "+second+" = "+(first+second));
                break;
            case '/':
                if(second==0)
                {
                    System.out.println(second+ " cant be used");
                }
                else {
                System.out.println("Division  "+ first+ " / "+second+" = "+(first/second));}
                break;
            case'x':
            case 'X':
            System.out.println("Multiplication : "+ first+ " x "+second+" = "+(first*second));
                break;
            default:
                System.out.println("wrong operation enters: "+c);
        }
    }
}
