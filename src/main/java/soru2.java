public class soru2 {
    public static void main(String[] args) {

        bul("20.78888");


    }

    public  static  void bul(String sayi){
        String []newString=sayi.split("[.]");
      String say1=newString[0];
        int say2=Integer.parseInt(newString[1]);

          while (say1!=""){
              say1=
             removeFirstandLast(say1);
              System.out.println(say1);
          }

    }
    public static String
    removeFirstandLast(String str)
    {


        StringBuilder sb = new StringBuilder(str);


        sb.deleteCharAt(str.length() - 1);


         sb.deleteCharAt(0);


        return sb.toString();
    }
}
