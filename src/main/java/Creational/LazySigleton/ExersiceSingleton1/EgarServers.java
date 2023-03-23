package Creational.LazySigleton.ExersiceSingleton1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EgarServers {
    private static final EgarServers instance = new EgarServers();
    public static List<String> serverList;

    private EgarServers() {
        serverList = new ArrayList<>();
    }

    public static EgarServers getInstance() {
        return instance;
    }

    public boolean add(String serverToAdd) {
        if ((serverToAdd.startsWith("http") || serverToAdd.startsWith("https"))
                && (!serverList.contains(serverToAdd))) {
            serverList.add(serverToAdd);
            return true;
        }
        return false;
    }

    public List<String> httpServers() {
        return serverList.stream()
                .filter(server -> server.startsWith("http"))
                .collect(Collectors.toUnmodifiableList());
    }

}
