package Creational.LazySigleton;
//https://www.youtube.com/watch?v=scmxhKLa_VQ

public class Driver {
    public static void main(String[] args) {
//        LazySingleton instance1 = LazySingleton.getInstance();
//        LazySingleton instance2 = LazySingleton.getInstance();
//
//        System.out.println(instance1.hashCode());
//        instance1.printData();
//        System.out.println(instance2.hashCode());
//        instance2.printData();

        new DataPrinter().start();
        new DataPrinter().start();
    }
}

class DataPrinter extends Thread {
    @Override
    public void run() {
        ThreadSafeSingleton.getInstance().printData();
    }
}