package string;

public class _String {

   public  static  String  toString(String s){
       return  s+"String";
   }

    public  static  StringBuilder  toStringBuilder(StringBuilder s){
        return  s.append("StringBuilder");
    }

    public  static  StringBuffer  toStringBuffer(StringBuffer s){
        return  s.append("StringBuffer");
    }

    public static void main(String[] args) {
        System.out.println(toString("String "));
        StringBuffer s1= new StringBuffer("THIS: ");
        System.out.println(toStringBuffer(s1));



        System.out.println(toStringBuilder(new StringBuilder("String builder ")));
        System.out.println("---------------------------------------------");
        System.out.println(s1.reverse());
        System.out.println(s1.toString().toUpperCase());
        System.out.println(s1);


    }
}
