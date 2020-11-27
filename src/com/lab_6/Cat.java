package com.lab_6;

class Cat extends Animal implements WishingZoo {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("Мяу");
    }
}
