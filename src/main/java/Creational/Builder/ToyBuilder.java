package Creational.Builder;

public class ToyBuilder {
    private String name;
    private String type;
    private String madeOf;


    public ToyBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ToyBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public ToyBuilder withMadeOf(String madeOf) {
        this.madeOf = madeOf;
        return this;
    }

    public Toy build(){
        return new Toy(name,type,madeOf);
    }
}
