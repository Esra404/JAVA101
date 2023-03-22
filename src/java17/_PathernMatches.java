package java17;

public class _PathernMatches {
    public static void main(String[] args) {
        System.out.println(formated(5.8));
        System.out.println(formatedSwtch(3));
        System.out.println(formatedSwtch(null));
        Shape shape= new Square(2,6);
        System.out.println(calculateArea(shape));

    }
    static  String formated(Object o){
         String formatted="unknown";
         if(o instanceof  Integer i){
             formatted=String.format("int %d", i);
         }
        if(o instanceof  String i){
            formatted=String.format(" int %s", i);
        }

         return  formatted;
    }


    static String formatedSwtch(Object o){
        return  switch (o){
            case null -> "null pointer Exception";
            case  Integer i-> String.format("int %d",i);
            case  String  s-> String.format("String %s",s);
            default -> "unknowm";
        };
    }
    
    static  String calculateArea(Shape shape){
       return switch (shape){
            case Square s  && s.area()>10-> " Yes";
           default -> throw new IllegalStateException("Unexpected value: " + shape);
       };

        
    }

    static  String  auString(Object s){
        return  switch (s){
            case String b && b.length()==1-> "";
            default -> throw new IllegalStateException("Unexpected value: " + s);
        };
    }
}





abstract  class  Shape{
    String name;
    int width;
    int height;

    public  abstract double area();

}

class  Square extends  Shape{

   public Square(int width, int height){
        this.height=height;
        this.width=width;
    }

    @Override
    public double area() {
        return this.width*this.height;
    }
}

class  Rectangle extends  Shape{
  public   Rectangle(int width, int height){
        this.height=height;
        this.width=width;
    }

    @Override
    public double area() {
        return this.width*this.height;
    }
}
