package lambdaAndStream;
interface Calculate {
int calculate(int a,int b);
}
public   class  Main{
    public static void main(String[] args) {
        Calculate add=((a, b) -> a+b);
        System.out.println(add.calculate(1,4));
        Calculate sun=((a, b) -> {
            if (a<b) {
                return b-a;}
            else
                return a-b;



        });
        System.out.println(sun.calculate(4,9));

    }
}
