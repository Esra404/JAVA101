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
        k.i=90;

        k.print();

    }

    public static <M> void print(M[] m){
        for (M i:m){
            System.out.println(String.format(" the object is '%s' and the value is '%s'",i.toString(),i.toString()));
        }


    }
}
class K<T>{
    int i;
    private T t;
    public void  print(){
        System.out.println(t.getClass().getClass());
        System.out.println((Integer)i instanceof Integer);
    }

    public void setT(T t) {
        this.t = t;
    }
}
