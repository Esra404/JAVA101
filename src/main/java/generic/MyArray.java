package generic;

public class MyArray {
    public static void main(String[] args) {
        String arr[]={"usman","khalid","come"};
        GenArray<String> myString=new GenArray<>(arr);
        String arrr[]=myString.getArray();
        for (String i:arrr
             ) {
            System.out.println(i);
        }
        System.out.println(myString.getElement(2));
    }

}

class GenArray<T>{
    T array[];

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    GenArray(T t[]){
        array=t;
    }

    public  T getElement(int indx){
        return array[indx];
    }


}
