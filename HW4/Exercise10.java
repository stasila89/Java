package ru.Piskovski.HW4;

public class Exercise10 {
    public static void main(String[] args) {
        task2();
    }

    public static void task2() {
        MyQueue myQueue = new MyQueue();
        System.out.println("\nОчередь автобусов в парке на выезд в 06:00 утра:");
        myQueue.printMyQueue();
        myQueue.enqueue("Автобус1");
        myQueue.enqueue("Автобус2");
        myQueue.enqueue("Автобус3");
        myQueue.enqueue("Автобус4");
        myQueue.enqueue("Автобус5");
        myQueue.enqueue("Автобус6");
        myQueue.enqueue("Автобус7");
        myQueue.enqueue("Автобус8");
        System.out.println("\nОчередь 06:30");
        myQueue.printMyQueue();
        System.out.printf("\nУехал %s\n",myQueue.dequeue());
        System.out.println("\nОстались:");
        myQueue.printMyQueue();
        System.out.printf("\nПервый в очереди %s\n",myQueue.first());
        System.out.printf("\nУехал %s\n",myQueue.dequeue());
        System.out.println("\nОстались:");
        myQueue.printMyQueue();
    }
}
