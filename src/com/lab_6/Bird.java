package com.lab_6;

public abstract class Bird {
    private String name;

    public Bird(String name){
        this.name = name;
    }

    public abstract void motion();
}
