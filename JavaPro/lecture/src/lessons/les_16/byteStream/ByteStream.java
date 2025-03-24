package lessons.les_16.byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        try (
                FileInputStream fis = new FileInputStream(
                        "D:\\Учеба\\Hillel IT School\\JavaPro\\lecture\\src\\lessons\\les_16\\byteStream\\input.txt");
                FileOutputStream fos = new FileOutputStream(
                        "D:\\Учеба\\Hillel IT School\\JavaPro\\lecture\\src\\lessons\\les_16\\byteStream\\output.txt");
//                FileInputStream fis = new FileInputStream("D:\\Учеба\\Hillel IT School\\JavaPro\\lecture\\src\\lessons\\les_16\\byteStream\\images.png");
//                 FileOutputStream fos = new FileOutputStream("D:\\Учеба\\Hillel IT School\\JavaPro\\lecture\\src\\lessons\\les_16\\byteStream\\plain.png");
                ) {
            int a;
            while((a = fis.read()) != -1) {
                fos.write(a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
