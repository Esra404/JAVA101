package generic;

public class Computer {
    private  String name;
    private String types;
    private  int id;

    public Computer(String name, String types, int id) {
        this.name = name;
        this.types = types;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", types='" + types + '\'' +
                ", id=" + id +
                '}';
    }
}
