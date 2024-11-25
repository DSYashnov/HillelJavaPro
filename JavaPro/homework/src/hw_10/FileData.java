package hw_10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FileData {
    public static Map<String, Set<String>> fileStorage = new HashMap<>();

    public static void addFile (String path, String fileName) {
        fileStorage.computeIfAbsent(path, k-> new HashSet<>()).add(fileName);
    }
}
