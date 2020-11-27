package com.lab_6;

public class Main {
    public static void main(String[] args) {
//        При выполнении задания необходимо реализовать следующие ассоциации:
//        между зоопарком и вольером – композиция; (при создании зоопарка - создаются вольеры)
//        между вольером и существом – агрегация. (при создании вольера в нем может и не быть существа)
//        Продемонстрируете работоспособность метода say() у всех сущностей.
        Dove golub = new Dove("Кеша");
        Penguin penguin = new Penguin("Бран");
        Cat cat = new Cat("Симба");
        Leon leon = new Leon("Муфаса");

        Zoo zoo = new Zoo();

        zoo.get_zoo(golub); // отправляем в очередь в зоопарк
        zoo.get_zoo(penguin);
        zoo.get_zoo(cat);
        zoo.get_zoo(leon);



    }
}
