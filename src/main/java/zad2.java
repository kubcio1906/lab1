import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        String message = s.nextLine();
        System.out.println(message);


        writeFile(message);
    }

    public static void writeFile(String fileName) throws IOException{

        try(FileOutputStream fileOutputStream = new FileOutputStream("file2.txt")){

            byte byteTab[] = fileName.getBytes();
            fileOutputStream.write(byteTab);


        }

    }
}
