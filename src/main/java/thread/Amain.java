package thread;

public class Amain {
    public static void main(String[] args) {
        A a= new A();
        B b = new B();
       a.start();
       b.start();
    }

}


class A extends  Thread{
    public  void  run(){
        for(int i=0; i<10; i++){
            System.out.println("A");
        }
    }
}

class B extends  Thread{
   public void  run(){
        for(int i=0; i<10; i++){
            System.out.println("B");
        }
    }
}
