package ru.Piskovski.HW1;

import ru.Piskovski.Utilities;

public class Exercise1 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {

        int n = Utilities.inputNaturelNumber("Введите натуральное число: ");

        long numTriangular = calculateTriangular(n);
        long numFactorial = calculateFactorial(n);

        printResult(n, numTriangular, numFactorial);
    }

    static long calculateTriangular(int n) {
        return n * (n + 1L) / 2L;
    }

    static long calculateFactorial(int n) {
        long factorial = 1;
        if (n <= 20) {
            for (int i = n; i > 1; i--) {
                factorial *= i;
            }
        } else {
            factorial = -1;
        }
        return factorial;
    }

    static void printResult(int n, long t, long f) {

        System.out.printf("\n%d-е треугольное число = %d\n", n, t);

        if (f < 1) {
            System.out.printf("%d! вычислить не получилось.\n", n);
            System.out.println("n! могу вычислить только для n не больше 20.");
        } else {
            System.out.printf("%d! = %d\n", n, f);
        }
    }
}
