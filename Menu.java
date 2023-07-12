package ru.Piskovski;

import ru.Piskovski.HW1.Exercise1;


public class Menu {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("\n\n Домашнее задание 1");
            System.out.println("1. Задача 1.");
            System.out.println("2. Задача 2.");
            System.out.println("3. Задача 3.");
            System.out.println(" Домашнее задание 2");
            System.out.println("4. Задача 1. ");
            System.out.println("5. Задача 2. ");
            System.out.println("6. Задача 3. ");
            System.out.println("7. Задаа 4. ");
            System.out.println("--- Урок 3. Коллекции JAVA: Введение ---");
            System.out.println("9. Задания 1-4. Из списка удалить четные числа, найти min, max, avg значения");
            System.out.println(" Домашнее задание 3");
            System.out.println("10. Задание 1. Перевернуть LinkedList");
            System.out.println("11. Задание 2. Реализовать очередь с помощью LinkedList");
            System.out.println("12. Задание 3. Добавить отмену последней операции в калькуляторе");
            System.out.println("--- Урок 5. Хранение и обработка данных ч2: множество коллекций Map ---");
            System.out.println("13. Задание 1. Написать простой класс Телефонный Справочник");
            System.out.println("---");
            System.out.println("14. Завершение работы приложения");
            int num = Utilities.inputNaturelNumber("Введите номер задания: ");

            switch (num) {
                case 1:
                    Exercise1.task1();
                    break;
                case 2:
//                    Program2.task2();
//                    break;
//                case 3:
//                    Program3.task3();
//                    break;
//                case 4:
//                    Program4.task4();
//                    break;
//                case 5:
//                    Program21.task1();
//                    break;
//                case 6:
//                    Program22.task2();
//                    break;
//                case 7:
//                    Program23.task3();
//                    break;
//                case 8:
//                    Program24.task4();
//                    break;
//                case 9:
//                    Program31.task1234();
//                    break;
//                case 10:
//                    Program41.task1();
//                    break;
//                case 11:
//                    Program42.task2();
//                    break;
//                case 12:
//                    Program43.task3();
//                    break;
//                case 13:
//                    Program51.task1();
//                    break;
                case 14:
                    flag = false;
                    System.out.println("\nДо новых встреч!");
                    System.out.println("Завершение работы приложения.");
                    break;

                default:
                    System.out.println("\nЗадания с таким номером не было.");
                    break;
            }

        }
    }
}
