package net.prostars;

public class Main {

    public static void main(String[] args) {
        RabbitImplUsingFile rabbitUsingFile = new RabbitImplUsingFile();
        rabbitUsingFile.prepare();

        RabbitImplUsingDB rabbitUsingDB = new RabbitImplUsingDB();
        rabbitUsingDB.prepare();

        RabbitUsingFile rabbitUsingFileWithDefault = new RabbitUsingFile();
        rabbitUsingFileWithDefault.prepare();

        RabbitUsingDB rabbitUsingDBWithDefault = new RabbitUsingDB();
        rabbitUsingDBWithDefault.prepare();
    }
}
