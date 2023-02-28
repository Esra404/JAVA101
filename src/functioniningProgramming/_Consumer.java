package functioniningProgramming;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Consumer1 consumer=new Consumer1("USMAN", "KHALID");

        consumerConsumer.accept(consumer);



    }

    static  Consumer<Consumer1> consumerConsumer= customr-> System.out.println("First Name:"+customr.fName
            +"Second Name: "+customr.sName);

    static class Consumer1{
        String fName;
        String sName;
        Consumer1(String fName,String sName){
            this.fName=fName;
            this.sName=sName;
        }
    }
}
