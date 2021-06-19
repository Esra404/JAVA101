import java.util.Scanner;

public class sayiSiralama_if_Ifade_le {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int first= in.nextInt();
        int second= in.nextInt();
        int third= in.nextInt();
        int enbu ,enk;

        if(first>second&&first>third){
           enbu=first;
           if(second>third){

               System.out.println(enbu+"\n"+second+"\n"+third);
           }
           else{
               System.out.println(enbu+"\n"+third+"\n"+second);
           }

        }
        else if(second>first&second>third){
            enbu=second;
            if(first>third){
                enk=third;
                System.out.println(enbu+"\n"+first+"\n"+third);
            }
            else{
                System.out.println(enbu+"\n"+third+"\n"+first);
            }


        }
        else{
            if(first>second){
            System.out.println(third+"\n"+first+"\n"+second);}
            else{
                System.out.println(third+"\n"+second+"\n"+first);}
            }
        }

    }

