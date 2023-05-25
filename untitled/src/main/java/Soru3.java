public class Soru3 {

    int n;

    public Soru3(int n){
        this.n=n;
    }

    public  int topla(){
        int toplam = 0;
        for (int i = 0; i <= this.n; i++) {
            int term = (int) Math.pow(2, i);
            toplam += term;
        }
        return toplam;
    }

    public  void goster(){
        String islem=" ";
        for (int i = 0; i <= this.n; i++) {
            int term = (int) Math.pow(2, i);
            islem += term+" ";
        }
        System.out.println(islem+"="+topla());
    }
}
