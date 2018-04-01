package net.prostars;

public interface ConfigurationFromFile extends Configuration {
    default void load() {
        System.out.println("load config from File.");
    }
}
