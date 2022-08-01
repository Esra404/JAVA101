package thread;

public class Threadd {
  private  int counter;
  public void increament(){
      counter++;
      System.out.println(counter);
  }
    public void decreament(){
        counter--;
        System.out.println(counter);
    }

    public  int getCounter(){
      return counter;
    }




    public static void main(String[] args) throws InterruptedException {
      Threadd threadd= new Threadd();
      Runnable t= ()->{
          for (int i=0; i<10; i++){
              threadd.increament();
          }

          try {
              Thread.sleep(500);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      };

        Threadd threadd1= new Threadd();
        Runnable t1= ()->{
            for (int i=0; i<10; i++){
                threadd1.decreament();
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
      new Thread(t).start();
      new Thread(t1).start();
    }
}
