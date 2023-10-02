


public class Exams1 {
    public static void main(String[] args) {
        int A[]={3,2,5,3,7,1};
        int B[]=new int[A.length];
        int sum=0;
        for (int i=0; i<A.length; i++){

            sum+=A[i];
            B[i]+=sum;
            System.out.println(B[i]);



        }




    }
}
