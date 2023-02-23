package com.example.demo.domain;

import java.util.Objects;

public class Car {
    private int plateNumber;
    private String brand;

    public Car() {
    }

    public Car(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Car(int plateNumber, String brand) {
        this.plateNumber = plateNumber;
        this.brand = brand;
    }

    public void drive() {
        System.out.println("My car is on");
    }

    public int getPlateNumber() {
        return this.plateNumber;
    }

    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;

        return this.plateNumber == ((Car) o).plateNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber);
    }



}
