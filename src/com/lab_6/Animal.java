package com.lab_6;

public abstract class Animal implements WishingZoo{
    private final String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void say();

    @Override
    public String toString() {
        return name;
    }
}
