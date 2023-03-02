import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year=input.nextInt();
//      switch (year%12){
//            case 1-> System.out.println("monkey");
//            case 2-> System.out.println("rooster");
//            case 3-> System.out.println("dog");
//            case 4-> System.out.println("pig");
//            case 5-> System.out.println("rat");
//            case 6-> System.out.println("ox");
//            case 7-> System.out.println("tiger");
//            case 8-> System.out.println("rabbit");
//            case 9-> System.out.println("dragon");
//            case 10-> System.out.println("snake");
//            case 11-> System.out.println("horse");
//            case 12-> System.out.println("sheep");
//            default -> System.out.println("cont be found");
//
//        }
        System.out.println(factorial(5));
        

    }


    static int factorial(int n) {
        return switch (n) {
            case 0, 1 -> 1;
            case 2    -> 2;
            default   -> factorial(n - 1) * n;
        };
    }




}
