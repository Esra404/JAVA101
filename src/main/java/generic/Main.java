package generic;

public class Main {
    public static void main(String[] args) {
      Student []students = {new Student("usman",2),new Student("usman",2),
              new Student("usman",2),new Student("usman",2)};
      Computer []computers = {new Computer("HP","hp",3),new Computer("HP","hp",3),
        new Computer("HP","hp",3),new Computer("HP","hp",3)};
//      print(students);
//      print(computers);

        K<Integer> k= new K<>();
        k.setT(555);
        k.i="90";

        k.print();
        System.out.println(k.getT());
        System.out.println(k.i);

    }

    public static <M> void print(M[] m){
        for (M i:m){
            System.out.println(String.format(" the object is '%s' and the value is '%s'",i.toString(),i.toString()));
        }


    }
}
class K<T>{
    String i;
    private T t;
    public void  print(){
        System.out.println(t.getClass().getClass());
        System.out.println(i);
    }

    public void setT(T t) {
        this.t = t;
    }

    public  T getT(){
      return   this.t;
    }
}
