package ru.Piskovski.HW4;

import ru.Piskovski.HW1.Exercise3;
import ru.Piskovski.HW2.Exercise7;
import ru.Piskovski.Utilities;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Exercise11 {
    private static final Logger logger = Logger.getLogger(Exercise7.class.getName());
    private static final String[] oper = new String[] { "+", "-", "*", ":" };

    public static void main(String[] args) {
        task3();
    }

    public static void task3() {
        Deque<Double> operands = new ArrayDeque<>();
        Deque<Integer> operations = new ArrayDeque<>();
        double firstNumber;
        double secondNumber;

        while (true) {

            if (!operations.isEmpty()) {
                char answer = Utilities.inputChar("Отменить последнюю операцию (y/N)? ");
                if (answer == 'y') {
                    System.out.printf("\nОтменили операцию \"%s\"\n", oper[operations.pop() - 1]);
                    secondNumber = operands.pop();
                    firstNumber = operands.pop();
                    System.out.printf("1-е число: %f\n",firstNumber);
                    System.out.printf("2-е число: %f\n",secondNumber);
                } else {

                    firstNumber = Utilities.inputDoubleNumber("Введите 1-е число: ");
                    secondNumber = Utilities.inputDoubleNumber("Введите 2-е число: ");
                }
            } else {

                firstNumber = Utilities.inputDoubleNumber("Введите 1-е число: ");
                secondNumber = Utilities.inputDoubleNumber("Введите 2-е число: ");
            }



            int operation = inputOperation();

            while (operation == 5){
                if (operations.isEmpty()){
                    System.out.println("\nСтек операций пуст.");
                } else {
                    System.out.printf("\nОтменили операцию \"%s\"\n", oper[operations.pop() - 1]);
                    secondNumber = operands.pop();
                    firstNumber = operands.pop();
                }
                System.out.printf("1-е число: %f\n",firstNumber);
                System.out.printf("2-е число: %f\n",secondNumber);
                operation = inputOperation();
            }

            double result = Exercise3.executeOperation(firstNumber, operation, secondNumber);


            operations.push(operation);
            operands.push(firstNumber);
            operands.push(secondNumber);


            Exercise3.printResult(firstNumber, operation, secondNumber, result);


            logTheResult(firstNumber, operation, secondNumber, result);


            if (Utilities.inputChar("\nПродолжим вычислять (y/n)? ") == 'n') {
                break;
            }

        }
    }

    static void logTheResult(double x, int operation, double y, double result) {

        try {
            FileHandler fh = new FileHandler("log_exercise7.txt", true);
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);

            if (y == 0) {
                logger.log(Level.WARNING, "Делить на ноль нельзя.");
            }
            logger.log(Level.INFO, String.format("%f %s %f = %f", x, oper[operation - 1], y, result));
            fh.close();
        } catch (Exception e) {
            System.out.println("Ошибка работы с лог-файлом.");
            System.out.println(e.getMessage());
        }

    }
    static int inputOperation() {
        String listOperation = "\n1. Сложение\n2. Вычитание\n3. Умножение\n4. Деление\n5. Отменить последнюю операцию";
        int numOperation = 0;
        while ((numOperation < 1) || (numOperation > 5)) {
            System.out.println(listOperation);
            numOperation = Utilities.inputNaturelNumber("Выбрать операцию: ");
        }
        return numOperation;
    }

}
