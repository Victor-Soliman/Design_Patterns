package Creational.LazySigleton.ExersiceSingleton1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public enum ServerEnum {
    INSTANCE;
    private List<String> serverList;

    ServerEnum() {
        serverList = new ArrayList<>();
    }


    public boolean add(String serverToAdd) {
        if ((serverToAdd.startsWith("http") || serverToAdd.startsWith("https")) &&
                (!serverList.contains(serverToAdd))) {
            return serverList.add(serverToAdd);
        }
        return false;
    }

    public List<String> httpServers() {
        return serverList.stream()
                .filter(server -> server.startsWith("http"))
                .collect(Collectors.toList());
    }

    public List<String> httpsServers() {
        return serverList.stream()
                .filter(server -> server.startsWith("https"))
                .collect(Collectors.toList());

    }

    @Override
    public String toString() {
        return "Servers{" +
                "servers=" + serverList +
                '}';
    }


}