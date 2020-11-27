package com.lab_6;

public abstract class Aviary {
    private int number;
    private Exotic being; // В каждом вольере живет только одно существо!

    public Aviary(int number, Exotic being) {
        this.number = number;
        this.being = being;
    }
}
