import java.io.IOException;

public class zad6 {
    public static void main(String[] args) throws IOException {
//        try (FileInputStream input = new FileInputStream("file.txt")) {
//            int temp = input.read();
//            int i =0;
//            while (temp != -1) {
//
//                System.out.println(i+ " "+ (char) temp);
//
//                temp = input.read();
//                i++;
//            }
//
//        }
        String napis = "ala ma kota";
        String[] podziel = napis.split(" ");
        for(int i=0;i<podziel.length;i++)
        {
            System.out.println(i+". "+podziel[i]);

        }


    }
}
