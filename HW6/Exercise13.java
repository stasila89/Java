package ru.Piskovski.HW6;

import ru.Piskovski.Utilities;

import java.util.HashSet;

public class Exercise13 {
    public static void main(String[] args) {

        System.out.println("Класс без переопределенных методов equals() и hashCode()");
        HashSet<Cat> cats = new HashSet<>();
        cats.add(new Cat("Frosya", "yellow", 7, Gender.FEMALE));
        cats.add(new Cat("Motroskin", "white-blue", 10, Gender.MALE));
        cats.add(new Cat("Sharik", "brown", 2, Gender.MALE));
        cats.add(new Cat("Barsik", "black", 3, Gender.MALE));
        cats.add(new Cat("Chip", "black-white", 5, Gender.MALE));
        cats.add(new Cat("Motroskin", "white-blue", 10, Gender.MALE));
        System.out.println(cats);

        Utilities.Divider('-', 40);
        System.out.println("Класс c переопределенными методами equals() и hashCode()");
        HashSet<ExtendedCat> cats2 = new HashSet<>();
        cats2.add(new ExtendedCat("Frosya", "yellow", 7, Gender.FEMALE));
        cats2.add(new ExtendedCat("Motroskin", "white-blue", 10, Gender.MALE));
        cats2.add(new ExtendedCat("Sharik", "brown", 2, Gender.MALE));
        cats2.add(new ExtendedCat("Barsik", "black", 3, Gender.MALE));
        cats2.add(new ExtendedCat("Chip", "black-white", 5, Gender.MALE));
        cats2.add(new ExtendedCat("Motroskin", "white-blue", 10, Gender.MALE));
        System.out.println(cats2);

    }
}