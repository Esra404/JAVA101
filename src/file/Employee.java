package file;

import java.io.Serializable;

public class Employee implements Serializable {
    String fname;
    String lname;
    long number;
    String adress;
    transient String  password;

    public Employee(String fname, String lname, long number, String adress, String password) {
        this.fname = fname;
        this.lname = lname;
        this.number = number;
        this.adress = adress;
        this.password = password;
    }

    public void  print(){
        System.out.println(fname +" "+ lname+ " "+password);
    }
}
