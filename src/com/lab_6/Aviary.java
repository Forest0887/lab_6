package com.lab_6;

public abstract class Aviary {
    private final int number;
    private final Exotic being; // В каждом вольере живет только одно существо!

    public Aviary(int number, Exotic being) {
        this.number = number;
        this.being = being;
    }

    public Exotic getBeing(){
        return being;
    }

    public int getNumber(){
        return number;
    }
}
