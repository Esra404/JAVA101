package mathpack;

public class RandomClass {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
//            between 5 and 10
            System.out.println(5+(int)(Math.random()*(10-5)));
        }
    }
}
