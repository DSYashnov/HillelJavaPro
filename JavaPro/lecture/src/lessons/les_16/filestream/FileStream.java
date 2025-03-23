package lessons.les_16.filestream;

import lessons.les_02.Input;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileStream {
    public static void main(String[] args) throws IOException {
        InputStream inputStream =
                new FileInputStream("D:\\Учеба\\Hillel IT School\\JavaPro\\lecture\\src\\lessons\\les_16\\filestream\\input.txt");
        int size = inputStream.available();
        System.out.println("file size: " + size);
        for (int i = 0; i < size; i++) {
            System.out.print((char) inputStream.read());
        }
        inputStream.close();

        OutputStream outputStream =
                new FileOutputStream("D:\\Учеба\\Hillel IT School\\JavaPro\\lecture\\src\\lessons\\les_16\\filestream\\output.txt");
        String str = "Stanislav Yashnov1";

        outputStream.write (str.getBytes(StandardCharsets.UTF_8));

        outputStream.close();
    }
}
