package enumm;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        StringBuilder builder;

        String []strings={"usman","khalid"};
        for(String s: strings){
            builder= new StringBuilder(s);
            System.out.println(builder.reverse());
        }
    }
}
