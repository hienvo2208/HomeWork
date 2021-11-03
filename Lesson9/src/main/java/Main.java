import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        MovieRepository test = new MovieRepository();
        test.printList(test.getData());
    }
}
