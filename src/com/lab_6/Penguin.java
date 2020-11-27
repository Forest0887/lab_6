package com.lab_6;

class Penguin extends Bird implements Exotic, Coldloving, WishingZoo {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void motion() {
        System.out.println("Я плаваю");
    }
}
