package com.lab_6;

import java.util.ArrayList;

public class Zoo {
    private final ArrayList<WishingZoo> want_in_zoo; // коллекция существ, желающих попасть в зоопарк
    private final ArrayList<Aviary> aviaries; // коллекция вольеров
    private final ArrayList<WishingZoo> didnt_get_to_the_zoo; // коллекция животных не попавших в зоопарк
    private int c_a; // кол во холодных вальеров
    private int h_a; // кол во теплых вальеров

    public Zoo(ArrayList<WishingZoo> want_in_zoo){
        this.want_in_zoo = want_in_zoo;
        aviaries = new ArrayList<>();
        didnt_get_to_the_zoo = new ArrayList<>();
    }

//    Этот метод распределяет существ по вольерам, если существо является экзотическим, то проверяется
//    его отношение к температуре и создается соответствующий вольер. Если существо не экзотическое,
//    то оно попадает в коллекцию не прошедших. После распределения коллекция желающих пройти очищается.
    public void distribution (){
        c_a = 0;
        h_a = 0;
        for (WishingZoo wz: want_in_zoo){
            if (wz instanceof Exotic){
                if (wz instanceof Coldloving){
                    c_a++;
                    aviaries.add(new ColdAviary(c_a, (Exotic) wz));
                } else if (wz instanceof Heatloving){
                    h_a++;
                    aviaries.add(new HeatAviary(h_a, (Exotic) wz));
                }
            } else {
                didnt_get_to_the_zoo.add(wz);
            }
        }
        want_in_zoo.clear();
    }

//    Этот метод выводит информацию:
//    о числе созданных теплых и холодных вольеров;
//    выводит список вольеров и соответствующих им существ (с указанием номера вольера и клички существа);
//    выводит по кличкам не прошедших в зоопарк существ.
    public void display(){
        System.out.println("Создано " + (c_a + h_a) + " вольеров. Из них " + c_a + " холодных, " +
                h_a + " теплых.\nСписок вольеров:");
        for (Aviary a: aviaries){
            System.out.println("Вольер номер: " + a.getNumber() + " Кличка животного в нем: " + a.getBeing().toString());
        }

        for (WishingZoo d: didnt_get_to_the_zoo){
            System.out.println("В зоопарк не попал " + d.toString());
        }
    }
}
