package com.lab_6;

class Leon extends Animal implements Exotic, Heatloving, WishingZoo {

    public Leon(String name){
        super(name);
    }

    @Override
    public void say() {
        System.out.println("Аррр");
    }
}
