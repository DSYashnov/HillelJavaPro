package lessons.les_16.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FolderStructureTask {

    private static final String FILE = "[F] : ";
    private static final String DIR = "[D] : ";
    private static final String PREF = "--";

    public static void main(String[] args) throws IOException{

        String rootDir = "D:\\Учеба\\Hillel IT School\\JavaPro\\lecture";
        File rootDit = new File(rootDir);
        StringBuffer fileStructure = new StringBuffer();
        getFileStructure(rootDit, "", fileStructure);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(fileStructure.toString());

        writeToFile(rootDir + "/fileStructure.txt", fileStructure.toString());

    }

    private static void getFileStructure (File file, String prefix, StringBuffer result) {

        if (file.isFile()){
            String str = prefix.concat(FILE).concat(file.getName()).concat(" size: ").concat(getFileSizeMegaBytes(file));
            System.out.println(str);
            result.append(str).append("\n");
        } else {
            String str = prefix.concat(DIR).concat(file.getName());
            System.out.println(str);
            result.append(str);
            List<File> files = Arrays.asList(file.listFiles());
            Collections.sort(files, Comparator.comparing(File::isDirectory).thenComparing(File::getName));
            for(File f : files) {
                getFileStructure(f, prefix.concat(PREF), result);
            }
        }
    }
    private static String getFileSizeMegaBytes(File file) {
        return BigDecimal.valueOf((double) file.length() / (1024*1024)).setScale(2, RoundingMode.HALF_DOWN).toEngineeringString() + " mb";
    }
    private static String getFileSizeKiloBytes(File file) {
        return (double) file.length() / 1024 + " kb";
    }

    private static void writeToFile (String path, String content) throws IOException {
        File file = new File(path);
        if(!file.exists()) //check if exist
            file.createNewFile(); //create file

        OutputStream outputStream =
                new FileOutputStream(path, false);
        outputStream.write(content.getBytes(StandardCharsets.UTF_8));
                    }
                }

