package ru.Piskovski.HW2;

import ru.Piskovski.Utilities;

import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Exercise5 {
    private static final Logger logger = Logger.getLogger(Exercise5.class.getName());
    public static void main(String[] args) {
        task2();
    }

    public static void task2() {
        int sizeArray = Utilities.inputNaturelNumber("Введите размер массива: ");
        int[] array = Utilities.createArrayInteger(sizeArray, -100, 100);
        System.out.println("\nИсходный массив: ");
        Utilities.printArrayInteger(array);

        sortBubbleWithLog(array);

        System.out.println("\nОтсортированный массив: ");
        Utilities.printArrayInteger(array);
    }

    static void sortBubbleWithLog(int[] arr) {
        if (arr.length < 2)
            return;
        try {
            FileHandler fh = new FileHandler("log_exercise5.txt", true);
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);

            for (int i = 1; i < arr.length; i++) {
                boolean isSorted = true;
                for (int j = 0; j < arr.length - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        isSorted = false;
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                    logger.info(Utilities.intArrayToString(arr));
                }
                if (isSorted) {
                    fh.close();
                    return;
                }
            }
            fh.close();
        } catch (Exception e) {
            System.out.println("Ошибка работы с лог-файлом.");
            System.out.println(e.getMessage());
        }

    }
}