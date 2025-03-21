package com.csaba79coder.domain;

import java.util.Arrays;

public class Herbivore extends Animal {

    public Herbivore() {

    }

    public Herbivore(String name, int age, String[] colors, String gender) {
        super(name, age, colors, gender);
    }

    @Override
    public void feed() {
        System.out.println("Eating plants! -> Herbivore");
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "name='" + super.getName() + '\'' +
                ", age='" + super.getAge() + '\'' +
                ", colors='" + Arrays.toString(super.getColors()) + '\'' +
                ", gender='" + super.getGender() + '\'' +
                '}';
    }
}
