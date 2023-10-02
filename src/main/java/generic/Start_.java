package generic;

import java.util.List;

public class Start_ {
    public static void main(String[] args) {
        Test<String , Integer> test= new Test<>("usman", 23);
        System.out.println(test.getT());
        System.out.println(test.getU());

    }

    public  <T>  T getValue(T t){
          return t;
    }

}

class Test<T extends Object, U >{
    private T t;
    private U u;

    Test(T t , U u){
        this.t=t;
        this.u=u;
    }

    public T getT(){
        return  t;
    }

    public  U getU(){
        return u;
    }

        }
