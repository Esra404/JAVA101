package enumm;

import java.util.Scanner;

public class TestEnum {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the name  of the paper");
        String input=scanner.nextLine();
        String paper_size= getPaperSize(input);
        System.out.println(paper_size);
//        switch (input.toUpperCase()){
//            case "A1"->System.out.println(Paper.A1.getLength()+" "+Paper.A1.ordinal());
//
//            case "A2"->
//                System.out.println(Paper.A2);
//
//            case "A3"->
//                System.out.println(Paper.A3);
//
//            default->
//                System.out.println("TRY AGAIN");
//
//        }
    }


    public static String getPaperSize(String paper){

        return switch (paper.toUpperCase()){
            case "A1"-> "LENGTH = "+Paper.A1.getLength() +" WIDTH = "+Paper.A1.getWidth();
            case "A2"-> "LENGTH = "+Paper.A2.getLength() +" WIDTH = "+Paper.A2.getWidth();
            case "A3"-> "LENGTH = "+Paper.A3.getLength() +" WIDTH = "+Paper.A3.getWidth();
            case "A4"-> "LENGTH = "+Paper.A4.getLength() +" WIDTH = "+Paper.A4.getWidth();
            default -> "there is not such paper in our store";


        };
    }
}
