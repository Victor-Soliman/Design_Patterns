package Creational.Builder;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog.DogBuilder()
                .name("Max")
                .age(3)
                .type("DoberMan")
                .build();
        System.out.println(dog);

        Dog dog2 = new Dog.DogBuilder()
                .name("Caine rau")
                .age(3)
                .type("Sitsu")
                .toys(List.of("Minge", "Ursulet"))
                .build();
        System.out.println(dog2);
    }
}
