public class Desne
{
    public static void main(String[] args) {
       desneRecursv(10);
    }

    public static void desneRecursv(int number){
        if(number%5<=number){
            System.out.print( ""+number);

            number=number-5;

            desneRecursv(number);


               }


    }
}
