package Creational.Builder;

public class AccountDetalies {
    private final int id;
    private final String email;
    private final Address address;
    private final Name name;

    private AccountDetalies(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.address = builder.address;
        this.name = builder.name;

    }


    public static class Builder {
        private int id;
        private String email;
        private Address address;
        private Name name;

        public Builder id(final int id) {
            this.id = id;
            return this;
        }

        public Builder email(final String email) {
            this.email = email;
            return this;
        }

        public Builder address(final Address adress) {
            this.address = adress;
            return this;
        }

        public Builder name(final Name name) {
            this.name = name;
            return this;
        }

        public AccountDetalies build() {
            return new AccountDetalies(this);
        }
    }
}
