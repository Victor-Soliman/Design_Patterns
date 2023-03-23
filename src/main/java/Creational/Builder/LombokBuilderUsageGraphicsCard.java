package Creational.Builder;

public class LombokBuilderUsageGraphicsCard {
    public static void main(String[] args) {
        GraphicsCard graphicsCard = new GraphicsCard.GraphicsCardBuilder()
                .memoryInMB(2048)
                .modelName("GF1660")
                .producer("Asus")
                .series("1xxx")
                .build();
        System.out.println(graphicsCard);
    }


}
