package com.csaba79coder.domain;

import java.util.Arrays;

public class Carnivore extends Animal {

    public Carnivore() {

    }

    public Carnivore(String name, int age, String[] colors, String gender) {
        super(name, age, colors, gender);
    }

    @Override
    public void feed() {
        System.out.println("Eating meet -> Carnivore");
    }

    @Override
    public String toString() {
        return "Carnivore{" +
                "name='" + super.getName() + '\'' +
                ", age='" + super.getAge() + '\'' +
                ", colors='" + Arrays.toString(super.getColors()) + '\'' +
                ", gender='" + super.getGender() + '\'' +
                '}';
    }
}
