package net.prostars;

public class RabbitImplUsingDB implements ConfigurationFromDB, LoggerUsingDB {

    @Override
    public void load() {
        System.out.println("load config from DB.");
    }

    @Override
    public void log(String message) {
        System.out.println("write log to DB.");
    }

    public void prepare() {
        log("load config");
        load();
    }
}
