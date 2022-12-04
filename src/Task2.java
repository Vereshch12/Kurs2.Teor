import java.io.FileNotFoundException;
import java.io.IOException;

public class Task2 {
    public static void foo() throws IOException, FileNotFoundException {

    }

    public static void main(String[] args) throws IOException, FileNotFoundException {
        try {
            foo();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
