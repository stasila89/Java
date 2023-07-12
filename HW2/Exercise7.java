package ru.Piskovski.HW2;

import ru.Piskovski.HW1.Exercise3;
import ru.Piskovski.Utilities;
import java.util.logging.*;

public class Exercise7 {
    private static final Logger logger = Logger.getLogger(Exercise7.class.getName());

    public static void main(String[] args) {
        task4();
    }

    public static void task4() {

        double firstNumber = Utilities.inputDoubleNumber("Введите 1-е число: ");
        double secondNumber = Utilities.inputDoubleNumber("Введите 2-е число: ");

        int operation = Exercise3.inputOperation();

        double result = Exercise3.executeOperation(firstNumber, operation, secondNumber);

        Exercise3.printResult(firstNumber, operation, secondNumber, result);

        logTheResult(firstNumber, operation, secondNumber, result);
    }

    static void logTheResult(double x, int operation, double y, double result) {

        try {
            FileHandler fh = new FileHandler("log_exercise7.txt", true);
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);

            if (y == 0) {
                logger.log(Level.WARNING, "Делить на ноль запрещено.");
            }
            String[] oper = new String[] { "+", "-", "*", ":" };
            logger.log(Level.INFO, String.format("%f %s %f = %f", x, oper[operation - 1], y, result));
            fh.close();
        } catch (Exception e) {
            System.out.println("Ошибка работы с лог-файлом.");
            System.out.println(e.getMessage());
        }

    }
}
