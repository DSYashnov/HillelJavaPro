package hw_16;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Load configuration from a file
            FileLoggerConfiguration config = FileLoggerConfigurationLoader.load("config.txt");

            // Create a logger
            FileLogger logger = new FileLogger(config);

            // Log messages
            logger.info("This is an info message.");
            logger.debug("This is a debug message.");
        } catch (IOException | FileMaxSizeReachedException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
