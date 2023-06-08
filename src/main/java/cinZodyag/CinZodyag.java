package cinZodyag;

import java.util.Scanner;

public class CinZodyag {
    public static void  main(String [] arg){
        Scanner input=new Scanner(System.in);
        System.out.println("enter your year of birth");
        int yr= input.nextInt();
        int check=yr%12;


        System.out.println(checkBurc(check
        ));



    }
    public  static String checkBurc(int check){
        String A="";
        switch (check){
            case 1:
                A=  "Maymun";
                break;
            case 2:
                A=  "kopek";
                break;
            case 3:
                A= "Domuz";
                break;
            case 4:
                A=  "fare";
                break;
            case 5:
                A=  "Öküz";
                break;
            case 6:
                A=  "kaplan";
                break;
            case 7:
                A= "tavsan";
                break;
            case 8:
                  A=  "Ejderha";
                break;
            case 9:
                A="yilan";
                break;
            case 10:
                A= "At";
                break;
            case 11:
                A= "Koyun";
                break;
            case 12:
                break;
            default: A="HATALI GIRDNZ";
        }
        return A;
    }
}
