package net.prostars;

public interface ConfigurationFromDB extends Configuration {
    default void load() {
        System.out.println("load config from DB.");
    }
}
