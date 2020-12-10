package com.lab_6;

public abstract class Bird {
    private final String name;

    public Bird(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract void motion();
}
