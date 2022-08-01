package thread;

class Counter implements  Runnable{

    @Override
    public void run() {
        for ( int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName()+" "+ i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Counter counter= new Counter();
        Thread thread1= new Thread(counter ,"counter1");
        Counter counter1= new Counter();
        Thread thread2= new Thread(counter1 ,"counter2");
        thread1.start();
        thread2.start();
    }
}
