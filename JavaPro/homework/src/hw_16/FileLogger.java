package hw_16;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger {
    private FileLoggerConfiguration config;

    public FileLogger(FileLoggerConfiguration config) {
        this.config = config;
    }

    private void log (String message, LoggingLevel level) throws IOException, FileMaxSizeReachedException {
        if (level.ordinal() > config.getLevel().ordinal()) {
            return;
        }

        File file = new File(config.getFilePath());
        if (file.exists() && file.length() >= config.getMaxSize()) {
            throw new FileMaxSizeReachedException("Max file size reached. Current: " + file.length() + " byte, Max: " + config.getMaxSize() + " bytes, Path: " + file.getAbsolutePath());
        }
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String logMessage = String.format(config.getFormat(), timestamp, level, message);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(logMessage);
            writer.newLine();
        }
    }
    public void debug (String message) throws IOException, FileMaxSizeReachedException {
        log (message, LoggingLevel.DEBUG);
    }
    public void info (String message) throws IOException, FileMaxSizeReachedException {
        log (message, LoggingLevel.INFO);
    }
}
