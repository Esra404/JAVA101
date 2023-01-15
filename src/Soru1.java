public class Soru1 {
    public static void main(String[] args) {
        String k[]={"osman","halit","koray","ibo"};
        String i[]=cevir(k);
        for (String j: i) {
            System.out.println(j);

        }

    }

    public static  String []  cevir(String dizi[]){

        int index=0;
        for (String i: dizi){
            StringBuilder input1 = new StringBuilder();
            input1.append(i);
            dizi[index]= String.valueOf(input1.reverse());
            index++;
        }
        return  dizi;
    }


}
