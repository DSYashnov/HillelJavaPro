package lessons.les_16.charStream;

import lessons.les_03.p1.A;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CharStream {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("D:\\Учеба\\Hillel IT School\\JavaPro\\lecture\\src\\lessons\\les_16\\charStream\\input.txt");
            FileWriter fileWriter = new FileWriter("D:\\Учеба\\Hillel IT School\\JavaPro\\lecture\\src\\lessons\\les_16\\charStream\\output.txt");
            List<Character> list = new ArrayList<>();
            int a;
            StringBuilder sb = new StringBuilder();
            while((a = fileReader.read()) != -1) {
                list.add((char)a);
                fileWriter.write(a);
                sb.append((char) a);
            }
            String text = sb.toString();
            System.out.println(text);

            String[] t = text.split("\n");
            System.out.println(t.length);

            //t[13] = "add value";

            System.out.println();
            sb = new StringBuilder();
            for (String str : t) {
                sb.append("\n");
            }
            System.out.println(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
