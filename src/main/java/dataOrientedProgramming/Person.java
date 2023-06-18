package dataOrientedProgramming;

public sealed interface Person permits Usman, Khalid{

    String print(String nam);
}


final class Usman implements Person{
    private  String name;
    @Override
    public String print(String name) {
        this.name=name;
        return this.name.toUpperCase();
    }
}

final class  Khalid implements Person{
   private  String name;

    @Override
    public String print(String name) {
        this.name=name;
        return this.name.toUpperCase();
    }
}