public class EbobEkok {
    public static void main(String[] args) {
        int first=6;
        int second=8;
int ebob=0;
        int i=1;
        while(i<6){
            if(first%i==0&&second%i==0){
               ebob=i;
            }
            i++;

        }
        System.out.println("Ebob: "+ ebob);
        int ekok =(first*second)/ebob;
        System.out.println("EKOK"+ekok);
    }
}
