package ru.Piskovski;

import ru.Piskovski.HW1.Exercise1;
import ru.Piskovski.HW1.Exercise2;
import ru.Piskovski.HW1.Exercise3;
import ru.Piskovski.HW2.Exercise4;
import ru.Piskovski.HW2.Exercise5;
import ru.Piskovski.HW2.Exercise6;
import ru.Piskovski.HW2.Exercise7;
import ru.Piskovski.HW3.Exercise8;
import ru.Piskovski.HW4.Exercise9;
import ru.Piskovski.HW4.Exercise10;
import ru.Piskovski.HW4.Exercise11;
import ru.Piskovski.HW5.Exercise12;



public class Menu {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("\n\n Домашнее задание 1");
            System.out.println("1. Задача 1.");
            System.out.println("2. Задача 2.");
            System.out.println("3. Задача 3.");
            System.out.println(" Домашнее задание 2");
            System.out.println("4. Задача 1.");
            System.out.println("5. Задача 2.");
            System.out.println("6. Задача 3.");
            System.out.println("7. Задаа 4.");
            System.out.println("Домашнее задание 3");
            System.out.println("8. Задача 1. ");
            System.out.println(" Домашнее задание 4");
            System.out.println("9. Задача 1.");
            System.out.println("10. Задача 2.");
            System.out.println("11. Задача 3.");
            System.out.println(" Домашнее задание 5");
            System.out.println("12. Задача 1.");
            System.out.println("13. Итоговая работа.");
            System.out.println("---");
            System.out.println("14. Завершение работы приложения");
            int num = Utilities.inputNaturelNumber("Введите номер задания: ");

            switch (num) {
                case 1:
                    Exercise1.task1();
                    break;
                case 2:
                    Exercise2.task2();
                    break;
                case 3:
                    Exercise3.task3();
                    break;
                case 4:
                    Exercise4.task1();
                    break;
                case 5:
                    Exercise5.task2();
                    break;
                case 6:
                    Exercise6.task3();
                    break;
                case 7:
                    Exercise7.task4();
                    break;
                case 8:
                    Exercise8.task1234();
                    break;
                case 9:
                    Exercise9.task1();
                    break;
                case 10:
                    Exercise10.task2();
                    break;
                case 11:
                    Exercise11.task3();
                    break;
                case 12:
                    Exercise12.task1();

                    break;
//                case 13:
//                    Exercise13.task1();
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
