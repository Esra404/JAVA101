public class AsalBulma {

    public static void main(String[] args) {
        if(asal(17)){
        System.out.println("asal");}
        else
            System.out.println("asal degil");
    }
    public  static  boolean asal(int a){

            boolean check=true;
            for(int j=2; j<a; j++){
                if(a%j==0){
                    check=false;
                    break;}

            }
            return check;

    }
}
