package net.prostars;

public class RabbitImplUsingFile implements ConfigurationFromFile, LoggerUsingFile {

    @Override
    public void load() {
        System.out.println("load config from File.");
    }

    @Override
    public void log(String message) {
        System.out.println("write log to File.");
    }

    public void prepare() {
        log("load config");
        load();
    }
}
