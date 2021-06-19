import java.util.Arrays;
import java.util.Scanner;

public class ArraySORT {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size= in.nextInt();
        int []array=new int[size];
        for(int i=0; i< array.length; i++){
            System.out.println("fill the array");
            array[i]= in.nextInt();
        }
        Arrays.sort(array);
        for(int i: array){
            System.out.print(" "+i);
        }
    }
}
