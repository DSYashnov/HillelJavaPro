package hw_10;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import static hw_10.FileData.addFile;
import static hw_10.FileData.fileStorage;

public class FileNavigator {

    public static Set<String> find (String path) {
        return fileStorage.getOrDefault(path, new HashSet<>());
    }

    public static void main(String[] args) {
        addFile("/path/to/files", "file1.txt");
        addFile("/path/to/files", "file2.txt");
        addFile("/another/path", "file3.txt");

        // Виконуємо пошук за шляхом
        System.out.println(find("/path/to/files")); // Поверне {file1.txt, file2.txt}
        System.out.println(find("/another/path"));  // Поверне {file3.txt}
        System.out.println(find("/non/existent/path")); // Поверне порожній набір {}

    }
}
