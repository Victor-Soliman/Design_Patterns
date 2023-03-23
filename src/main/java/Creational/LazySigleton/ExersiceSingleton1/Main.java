package Creational.LazySigleton.ExersiceSingleton1;

public class Main {
    public static void main(String[] args) {
//        ex 1 : Lazy Singleton
        Servers server = Servers.getServer();
        System.out.println(server);
        server.add("https");
        server.add("http");
        server.add("http");
        server.add("https");
        server.add("Marco");
        server.add("Polo");

        System.out.println(server);

        // Eager Singleton
        EgarServers egarServers = EgarServers.getInstance();

        server.add("https");
        server.add("http");
        server.add("http");
        server.add("https");
        server.add("Marco");
        server.add("Polo");
        System.out.println(server);

        // ex 2
//        new ServerThread().start();
//        new ServerThread().start();

    }
}

class ServerThread extends Thread {
    @Override
    public void run() {
        ThreadSafe serverThread1 = ThreadSafe.getInstance();

    }
}