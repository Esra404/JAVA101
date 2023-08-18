package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class  Array {
    public static void main(String[] args) {
        System.out.println("DIZI BOYUTU GIRIN");
        int boyutu=new Scanner(System.in).nextInt();
        int dizi[]=rasgeleSayi(boyutu);

        Arrays.stream(dizi).forEach(System.out::println);


        Student student = new Student("USMAN", "34", new String[]{"SCIENCE","Math"});
        System.out.println(student.toString());
    }

    public  static  int []  rasgeleSayi(int boyut){
        int [] dizi= new int[boyut];
         Random random= new Random();

       for(int i=0; i< dizi.length; i++){
           dizi[i]= random.nextInt(10,100);
       }

        return dizi;
    }
}

class  Student {
    private String name;
    private String age;
    private String  couurse[];

    public Student(String name, String age, String[] couurse) {
        this.name = name;
        this.age = age;
        this.couurse = couurse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String[] getCouurse() {
        return couurse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", couurse=" + Arrays.toString(couurse) +
                '}';
    }

    public void setCouurse(String[] couurse) {
        this.couurse = couurse;
    }
}