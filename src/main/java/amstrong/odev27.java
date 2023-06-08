package amstrong;

import java.util.Scanner;

public class odev27 {
    static   String PASSWORD="12345";
    static   String USER="username";
    static  final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {


       int changeAtemp=0;
        int atmp=3;
        do {
            System.out.println("enter username");
            String userName= in.next();


            System.out.println("enter passord");
            String userPassword=in.next();
            if(userName.equals(USER)||userPassword.equals(PASSWORD)){
                System.out.println("basarli girzdiniz");
                System.exit(0);
            }
            else{
                System.out.println("wrong password gridiniz");
                System.out.println("enter 1 to chnge password or 2 to try again");
                int check= in.nextInt();
                if(check==1){
                    System.out.println("enter new Password");
                    PASSWORD= in.next();
                    changeAtemp++;
                }
                else{
                    --atmp;
                    System.out.println("You have "+atmp+" left");

                }

            }
            System.out.println(changeAtemp);

        }while (atmp>0||changeAtemp==2);
    }
}
