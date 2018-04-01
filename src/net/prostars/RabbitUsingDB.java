package net.prostars;

public class RabbitUsingDB implements ConfigurationFromDB, LoggerUsingDB {
    public void prepare() {
        log("load config");
        load();
    }
}
