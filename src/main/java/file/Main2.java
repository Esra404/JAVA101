package file;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee=new Employee("usman","khalid",122333, "ghana","123456");
        Employee employee1=new Employee("usman1","khalid",122333, "ghana","123456");
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream("emply.ser");
            ObjectOutputStream out= new ObjectOutputStream(fileOutputStream);
            out.writeObject(employee);
            out.writeObject(employee1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Employee e=null;
        FileInputStream fileInputStream;
        fileInputStream= new FileInputStream("emply.ser");
        ObjectInputStream in = new ObjectInputStream(fileInputStream);
        e= (Employee) in.readObject();
        e.print();
    }
}
