package Creational.Builder;

public class ToyBuilderUsage {

    public static void main(String[] args) {
        Toy toy = new ToyBuilder()
                .withName("BOBO")
                .withType("Ball")
                .withMadeOf("Selicon")
                .build();
        System.out.println(toy);
    }
}
