package net.prostars;

public interface LoggerUsingDB extends Logger {
    default void log(String message) {
        System.out.println("write log to DB.");
    }
}
