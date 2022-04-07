import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class zad1 {
    public static void main(String[] args) throws IOException {
        printFile("file.txt");


    }
    public static void printFile (String filename) throws IOException {

        try (FileInputStream input = new FileInputStream(filename)) {
            int temp = input.read();

            while (temp != -1) {
                System.out.println( (char) temp);
                temp = input.read();
            }
        }

    }

}

