package ru.Piskovski.HW4;
import java.util.LinkedList;

public class MyQueue {
    private LinkedList elements = new LinkedList();

    public MyQueue() { }
    public MyQueue(LinkedList linkedList) {
        this.elements = linkedList;
    }

    public void enqueue(Object element){
        elements.addLast(element);
    }

    public Object dequeue(){
        return elements.pollFirst();
    }

    public Object first(){
        return elements.peekFirst();
    }


    public void printMyQueue(){
        int sizeMyQueue = elements.size();
        StringBuilder result = new StringBuilder();
        if (elements.isEmpty()) {
            result.append("[]");
        } else {
            result.append(String.format("[%s", elements.get(0).toString()));
            for (int i = 1; i < sizeMyQueue; i++) {

                result.append(String.format(", %s", elements.get(i).toString()));
            }
            result.append("]");
        }
        System.out.println(result.toString());
    }
}