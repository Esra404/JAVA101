package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        writeTofile();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("Dog.txt");
            int byteCout;
            byte b[]= new byte[16];
            StringBuilder stringBuilder = new StringBuilder();
            while ((byteCout=fileInputStream.read(b))!=-1){
                stringBuilder.append(new String(b,0,byteCout));
                System.out.println(".........................");
                System.out.println(new String(b,0,byteCout));
                System.out.println(".........................");
            }
            System.out.println(stringBuilder.toString());
        } catch (FileNotFoundException e) {
e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public  static  void writeTofile() throws IOException {
        FileOutputStream fileOutputStream =null;
        try {
            fileOutputStream=new FileOutputStream("Dog.txt");
            Scanner scanner = new Scanner(System.in);
            byte bytecode[];
            for (int i=0; i<5; i++){
                bytecode=scanner.nextLine().getBytes();
                fileOutputStream.write(bytecode);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            fileOutputStream.close();
        }
    }
    }
