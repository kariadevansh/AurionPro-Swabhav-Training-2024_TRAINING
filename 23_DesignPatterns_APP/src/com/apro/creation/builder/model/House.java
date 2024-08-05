package com.apro.creation.builder.model;

public class House {
    private int numberOfRooms;
    private String roofType;
    private boolean hasGarden;
    private boolean hasGarage;
    private String color;

    private House(Builder builder) {
        this.numberOfRooms = builder.numberOfRooms;
        this.roofType = builder.roofType;
        this.hasGarden = builder.hasGarden;
        this.hasGarage = builder.hasGarage;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfRooms=" + numberOfRooms +
                ", roofType='" + roofType + '\'' +
                ", hasGarden=" + hasGarden +
                ", hasGarage=" + hasGarage +
                ", color='" + color + '\'' +
                '}';
    }

    public static class Builder {
        private final int numberOfRooms;  // Required parameter
        private String roofType = "wooden"; // Default value
        private boolean hasGarden = false; // Default value
        private boolean hasGarage = false; // Default value
        private String color = "White"; // Default value

        // Constructor with required parameters
        public Builder(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
        }

        public Builder setRoofType(String roofType) {
            this.roofType = roofType;
            return this;
        }

        public Builder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public Builder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
