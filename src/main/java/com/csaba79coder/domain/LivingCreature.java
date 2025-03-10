package com.csaba79coder.domain;

import java.util.Arrays;

public abstract class LivingCreature {

    private static int creatureCounter;
    private String name;
    private int age;
    private String[] colors;

    public LivingCreature() {
        this("", 0, null); // Meghívja a másik konstruktrot
    }

    public LivingCreature(String name, int age, String[] colors) {
        creatureCounter++; // növeli a számlálót
        this.name = name;
        this.age = age;
        this.colors = colors;
    }

    // ez lehetne akár String visszatérés, de egyszerűsítés miatt, most void (mert csak kiratni akarom)
    // public abstract String feed(); // a tipus / visszatérés az mindig igény függő ...
    public abstract void feed();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String[] getColors() {
        return colors;
    }

    public static int getCreatureCounter() {
        return creatureCounter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "LivingCreature{" +
                "name='" + this.name + '\'' +
                ", age='" + this.age + '\'' +
                ", colors'" + Arrays.toString(this.colors) + '\'' +
                '}';
    }
}
