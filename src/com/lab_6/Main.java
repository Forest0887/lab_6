package com.lab_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dove golub = new Dove("Кеша");
        Penguin penguin = new Penguin("Бран");
        Cat cat = new Cat("Симба");
        Leon leon = new Leon("Муфаса");

        ArrayList<WishingZoo> list = new ArrayList<>();
        list.add(golub);
        golub.motion();
        list.add(penguin);
        penguin.motion();
        list.add(cat);
        cat.say();
        list.add(leon);
        leon.say();

        Zoo zoo = new Zoo(list);

        zoo.distribution();
        zoo.display();
    }
}
