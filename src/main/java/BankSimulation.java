import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

class BankKuyruk extends Thread {
//    saniye static tutmasi cunku degistirmz
    private final static Long MILISANIYE= 10000L;

    private Queue<String> kuyruk = new LinkedList<>();
//kuyruga 10 kisi eklme
    public BankKuyruk(int kisi) {
        for (int i = 1; i <= kisi; i++) {
            kuyruk.offer(i+".  Kişi " );
        }
    }
//thread implementasyonu
    public void run() {
        while (!kuyruk.isEmpty()) {
//            yazdirma
            System.out.println(kuyruk.poll() +" "+ TimeUnit.MILLISECONDS.toSeconds(MILISANIYE) +" Saniyede bitmiştir");
            try {
//                10 saniye aralik icin sleep
                Thread.sleep(MILISANIYE);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
//main sinifi
public class BankSimulation {
    public static void main(String[] args) {
        BankKuyruk bankakuyruk = new BankKuyruk(10);
//        thread baslamasi yani 10 saniye aralik
        bankakuyruk.start();
    }
}
