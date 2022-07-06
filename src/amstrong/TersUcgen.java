package amstrong;

public class TersUcgen {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
            for(int m=2*10-1; m>=(2*i+1); m--){
                System.out.print("^");
            }
            System.out.println();
        }
    }
}
