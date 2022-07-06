import java.util.Scanner;

public class TestEnum {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the name  of the paper");
        String input=scanner.nextLine();
        switch (input.toUpperCase()){
            case "A1":
                System.out.println(Paper.A1.getLength()+" "+Paper.A1.ordinal());
                break;
            case "A2":
                System.out.println(Paper.A2);
                break;
            case "A3":
                System.out.println(Paper.A3);
                break;
            default:
                System.out.println("TRY AGAIN");

        }
    }
}
