package ru.Piskovski.HW1;

import ru.Piskovski.Utilities;

import static ru.Piskovski.HW2.Exercise7.task4;

public class Exercise3 {
    public static void main(String[] args) {
        task3();
        task4();
    }

    public static void task3() {


        double firstNumber = Utilities.inputDoubleNumber("Вводим 1-е число: ");
        double secondNumber = Utilities.inputDoubleNumber("Вводим 2-е число: ");


        int operation = inputOperation();


        double result = executeOperation(firstNumber, operation, secondNumber);


        printResult(firstNumber, operation, secondNumber, result);
    }

    public static int inputOperation() {
        String listOperation = "\n1. Сложение\n2. Вычитание\n3. Умножение\n4. Деление";
        int numOperation = 0;
        while ((numOperation < 1) || (numOperation > 4)) {
            System.out.println(listOperation);
            numOperation = Utilities.inputNaturelNumber("Выбрать операцию: ");
        }
        return numOperation;
    }

    public static double executeOperation(double x, int operation, double y) {
        double result = 0.0;
        switch (operation) {
            case 1:
                result = x + y;
                break;
            case 2:
                result = x - y;
                break;
            case 3:
                result = x * y;
                break;
            case 4:

                result = x / y;
                break;
        }
        return result;
    }

    public static void printResult(double x, int operation, double y, double result) {
        String[] oper = new String[] { "+", "-", "*", ":" };
        System.out.printf("\n%f %s %f = %f\n", x, oper[operation - 1], y, result);
    }
}
