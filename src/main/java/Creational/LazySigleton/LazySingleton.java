package Creational.LazySigleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LazySingleton {
    private static LazySingleton instance;
    private String[] letters = {"a", "b", "c", "d"};
    private List<String> data = Arrays.asList(letters);

    private LazySingleton() {
        Collections.shuffle(data);
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void printData() {
        for (String item : data) {
            System.out.printf("%s ", item);
        }
        System.out.println();
    }
}
