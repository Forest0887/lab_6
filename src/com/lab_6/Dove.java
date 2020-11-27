package com.lab_6;

class Dove extends Bird implements WishingZoo{ // Голубь

    public Dove(String name) {
        super(name);
    }

    @Override
    public void motion() {
        System.out.println("Я летаю");
    }
}
