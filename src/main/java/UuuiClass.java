import java.util.UUID;

public class UuuiClass {
    public static void main(String[] args) {

        System.out.println(UUID.randomUUID());

        String fileName="suamamam.m";
        String fileExtension = fileName.substring(fileName.indexOf("."), fileName.length());
        System.out.println(UUID.randomUUID()+fileName+fileExtension);
    }
}
