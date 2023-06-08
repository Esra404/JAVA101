package generic;

import org.w3c.dom.ls.LSOutput;

public class Code {
    public static void main(String[] args) {
        demo d=new demo("String");
        System.out.println(d.getObject());
        demo d1= new demo(111);
        System.out.println(d1.getObject());
        System.out.println("generic--------------------------");
        Data<Integer> data = new Data<>();
        data.setElement(8899);
        System.out.println(data.getElement());
        Data<Float> data1= new Data<>();
        System.out.println(data1.getElement());
        data1.setElement(44f);
        System.out.println(data1.getElement());
        MyClass<Integer , String> myGen= new MyClass<>(78,"usmamam");
        System.out.println(myGen.getKey());
        System.out.println(myGen.getValue());

    }


}
class demo{
    private  Object object;
    demo(Object object){
        this.object=object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
class  Data<T> {
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
interface  MyGen<T,K>{
  T getValue();
  K getKey();
}
class  MyClass<T,K> implements MyGen<T,K>{

private T value;
    private  K key;
    public MyClass(T value, K key) {

        this.value = value;
        this.key = key;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public K getKey() {
        return key;
    }
}