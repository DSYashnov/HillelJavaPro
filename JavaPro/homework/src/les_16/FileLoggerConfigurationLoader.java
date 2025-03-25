package les_16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLoggerConfigurationLoader {
    public static FileLoggerConfiguration load(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String filePath = null, format = null;
        LoggingLevel level = null;
        long maxSize = 0;

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(": ");
            if (parts.length != 2) continue;

            switch (parts[0]) {
                case "FILE": filePath = parts[1]; break;
                case "LEVEL": level = LoggingLevel.valueOf(parts[1]); break;
                case "MAX-SIZE": maxSize = Long.parseLong(parts[1]); break;
                case "FORMAT": format = parts[1]; break;
            }
        }
        reader.close();
        return new FileLoggerConfiguration(filePath, level, maxSize, format);
    }
}
