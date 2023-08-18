import java.util.Arrays;

public class NestedLoop {
    public static void main(String[] args) {
        int         A[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0; i<A.length; i++){
            for(int j=0; j< A.length; j++){
                System.out.print(A[i][j]);
            }
            System.out.println(" ");
        }


        System.out.println("\n\n");

        int toplam=0;
        for(int i=0; i<A.length; i++){
            for(int j=0; j<=i; j++){
                System.out.print(A[i][j]);
                toplam+=A[i][j];
            }
            System.out.println(" ");
        }

        System.out.println("\nTOPLAM= "+toplam);
    }
}
