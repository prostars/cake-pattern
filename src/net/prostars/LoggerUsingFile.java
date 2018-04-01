package net.prostars;

public interface LoggerUsingFile extends Logger {
    default void log(String message) {
        System.out.println("write log to File.");
    }
}
