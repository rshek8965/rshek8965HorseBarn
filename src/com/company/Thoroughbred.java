package com.company;

public class Thoroughbred implements Horse {

    private String name;
    private int weight;

    public Thoroughbred (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() {return this.name;}
    public int getWeight() {return this.weight;}
}
