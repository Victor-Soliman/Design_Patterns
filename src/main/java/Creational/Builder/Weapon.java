package Creational.Builder;

import java.util.ArrayList;
import java.util.List;

public class Weapon {
    public static void main(String[] args) {

//        Builder.Weapon.Weapons laserWeapon = new Builder.Weapons.Builder()
//                .withdamage(123)
//                .withName("Laser Gun")
//                .withPerks(List.of("Color: red"))
//                .withDurability(50L)
//                .build();
        Weapons weapon = new Builder()
                .withName("Kalashnikov")
                .withType("Pistol")
                .withdamage(92)
                .build();
        System.out.println(weapon);


    }

    public static class Builder {
        private String type;
        private String name;
        private Integer damage;
        private long durability;
        private List<String> perks = new ArrayList<>();

        //configuring methods
        public Builder withType(String type) {
            this.type = type;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withdamage(Integer damage) {
            this.damage = damage;
            return this;
        }

        public Builder withDurability(long durability) {
            this.durability = durability;
            return this;
        }

        public Builder withPerks(List<String> perks) {
            this.perks = perks;
            return this;
        }

        //create the target Object
        public Weapons build() {
            return new Weapons(type, name, damage, durability, perks);
        }
    }

    public static class Weapons {
        private String type;
        private String name;
        private Integer damage;
        private long durability;
        private List<String> perks;

        private Weapons(String type, String name, Integer damage, long durability, List<String> perks) {
            this.type = type;
            this.name = name;
            this.damage = damage;
            this.durability = durability;
            this.perks = perks;
        }

        @Override
        public String toString() {
            return "Weapons{" +
                    "type='" + type + '\'' +
                    ", name='" + name + '\'' +
                    ", damage=" + damage +
                    ", durability=" + durability +
                    ", perks=" + perks +
                    '}';
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getDamage() {
            return damage;
        }

        public void setDamage(Integer damage) {
            this.damage = damage;
        }

        public long getDurability() {
            return durability;
        }

        public void setDurability(long durability) {
            this.durability = durability;
        }

        public List<String> getPerks() {
            return perks;
        }

        public void setPerks(List<String> perks) {
            this.perks = perks;
        }


    }

}
