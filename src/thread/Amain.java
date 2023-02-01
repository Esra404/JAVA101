package thread;

public class Amain {
    public static void main(String[] args) {
        A a= new A();
        B b = new B();
        a.show();
        b.show();
    }

}


class A{
    public  void  show(){
        for(int i=0; i<5; i++){
            System.out.println("A");
        }
    }
}

class B{
   public void  show(){
        for(int i=0; i<5; i++){
            System.out.println("B");
        }
    }
}
