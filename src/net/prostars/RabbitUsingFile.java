package net.prostars;

public class RabbitUsingFile implements ConfigurationFromFile, LoggerUsingFile {
    public void prepare() {
        log("load config");
        load();
    }
}
