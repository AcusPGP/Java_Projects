import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Trash {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("object.trash")) {
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                String user = "PhamGiaPhuc";
                oos.writeObject(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
