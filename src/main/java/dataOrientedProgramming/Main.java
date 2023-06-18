package dataOrientedProgramming;

public class Main {
    public static void main(String[] args) {
        Points points=new Points(2,4);
        System.out.println(points.toString());

        Usman usman= new Usman();
        System.out.println(usman.print("USmAN"));

        Person khalid=new Khalid();
        System.out.println(khalid.print(points.toString()));
    }
}
