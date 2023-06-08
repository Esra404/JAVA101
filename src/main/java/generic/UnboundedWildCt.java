package generic;

public class UnboundedWildCt {
    public static void main(String[] args) {
        H1 h1 = new H1(5);
        H2 h2 = new H2(55);
        print(new H2(55));


    }

    public static<T>  void print(T t) {
        System.out.println(t.getClass().componentType());
    }}




class  H1{
    private  int i;

    public H1(){

    }

    public H1(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

class  H2{
    private  int i;

    public H2(){

    }

    public H2(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}