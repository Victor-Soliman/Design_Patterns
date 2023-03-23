package Creational.Builder;

public class Toy {
    private String name;
    private String type;
    private String madeOf;

    public Toy(String name, String type, String madeOf) {
        this.name = name;
        this.type = type;
        this.madeOf = madeOf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMadeOf() {
        return madeOf;
    }

    public void setMadeOf(String madeOf) {
        this.madeOf = madeOf;
    }
}
