package comparatorClass;

public record Student(String firstName, String secondName, int age)  implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
