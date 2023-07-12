package ru.Piskovski.HW4;

import ru.Piskovski.Utilities;

import java.util.LinkedList;

public class Exercise9 {
    static final int MINRANDOMVALUE = -100;
    static final int MAXRANDOMVALUE = 100;

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        LinkedList<Integer> linkedList = Utilities.createRandomLinkedList(Utilities.randomIntNumber(3, 10),
                MINRANDOMVALUE, MAXRANDOMVALUE);

        System.out.println("\nНачальный список: ");
        System.out.println(linkedList);

         LinkedList<Integer> rollLinkedList = reverseLinkedList(linkedList);


        System.out.println("\n\"Реверсный\" список: ");
        System.out.println(rollLinkedList);


    }

      static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> linkedList)
      {
      LinkedList<Integer> result = new LinkedList<>();
     while (linkedList.size() > 0) {
      result.add(linkedList.pollLast());
      }
      return result;
     }
}
