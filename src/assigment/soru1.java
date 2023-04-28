package assigment;

public class soru1 {
    public static void main(String[] args) {
        int rows = 8;
         int rowcount=1;

        for (int i = rows; i >= 1; --i) {


            int num=rowcount;
            int num2=8;
            for (int j = 1; j <= i; ++j) {
                System.out.print(num + " ");
                num+=num2;
                num2--;
            }

           rowcount++;

            System.out.println();
        }






    }
}
