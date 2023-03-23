package Creational.Builder;

import java.util.List;

public class Name {
    private final String firstname;
    private final List<String> middleNames;
    private final String sureName;

    private Name(Builder builder) {
        this.firstname = builder.firstname;
        this.middleNames = builder.middleNames;
        this.sureName = builder.sureName;
    }


    public static class Builder {
        private String firstname;
        private List<String> middleNames;
        private String sureName;


        public Builder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder middleNames(List<String> middleNames) {
            this.middleNames = middleNames;
            return this;
        }

        public Builder sureName(String sureName) {
            this.sureName = sureName;
            return this;
        }

        public Name build() {
            return new Name(this);
        }
    }

}
