package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> student= new ArrayList<>();
        student.add(new Student("usman", "khalid", 10));
        student.add(new Student("usman1", "khalid2", 102));
        student.add(new Student("usma1n", "khalid", 101));
        student.add(new Student("rusman", "kdhalid", 106));
        student.add(new Student("usdasman", "khsalid", 100));
        student.add(new Student("usmansd", "khadslid", 104));


        Comparator<Student> com=new Comparator<>(){

            @Override
            public int compare(Student o1, Student o2) {

                if(o1.lName.length()>o2.lName.length()){
                    return  1;
                }
                else
                    return -1;
            }
        };

        Collections.sort(student,com);

        for(Student i:student){
            System.out.println(i.toString());
        }
    }
}
class  Student{
    String fname;
    String lName;
    int note;
    Student(String fname, String lName, int note)
    {
        this.fname=fname;
        this.lName=lName;
        this.note=note;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lName='" + lName + '\'' +
                ", note=" + note +
                '}';
    }
}

