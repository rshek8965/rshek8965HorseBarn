package com.company;

public class Zebra implements Horse {

    private String name;
    private int weight;

    public Zebra (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getname() {return this.name;}
    public int getWeight() {return this.weight;}
}
