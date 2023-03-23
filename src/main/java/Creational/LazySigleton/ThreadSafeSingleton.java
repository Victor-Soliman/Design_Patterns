package Creational.LazySigleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private static boolean delayMe = true;
    private String[] letters = {"a", "b", "c", "d"};
    private List<String> data = Arrays.asList(letters);

    private ThreadSafeSingleton() {
        Collections.shuffle(data);
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    delayMe = false;
                    if (delayMe) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    instance = new ThreadSafeSingleton();
                }
            }

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