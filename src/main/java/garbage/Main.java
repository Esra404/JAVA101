package garbage;

public class Main {

//    this is depreciated
//    @Override
//  public  void finalize(){
//
//}


    public static void main(String[] args) {
        System.out.println("before carbage collection is done");
      Main main1 = new Main();
      Main main2= new Main();

        System.out.println("Object 1 "+main1 +" object 2 "+ main2);
      main2=null;
      main1=null;
//      gc(); command in cabbage collections this is use to invoke the carbage collector to perform clean up
      System.gc();
        System.out.println("after carbage collection is done");
        System.out.println("Object 1 "+main1 +" object 2"+ main2);

    }
}


