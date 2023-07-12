package ru.Piskovski.HW5;

import java.util.List;

public class Exercise12 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        String[] phones = inputPhones();
        PhoneNumbers phoneNumbers = new PhoneNumbers();
        phoneNumbers.add("Лысый", "+375292663772");
        for (String record : phones) {
            String[] recordParts = record.split(" ");
            phoneNumbers.add(recordParts[0], recordParts[1]);
        }


        String findName = "Озеров";
        System.out.printf("\nРезультат проверки телефонных номеров по фамилии %s:\n", findName);
        List<String> listPhones = phoneNumbers.get(findName);
        if (listPhones == null) {
            System.out.printf("такого номера нет.\n", findName);
        } else {
            System.out.println(listPhones);
        }
    }

    private static String[] inputPhones() {
        return new String[]{
                "Кузнецов +375296667771",
                "Пушкин +375296662271",
                "Лысый +375292663772",
                "Леший +375296557771",
                "Кравцов +375296667222",
                "Озеров +375296668881",
                "Пуговкин +375446667771",
                "Кукуля +375336667771",
                "Пушкин +375296666671",
                "Озеров +375296667991",
                "Кузнецов +375296667771",
                "Пушкин +375296662271",
                "Лысый +375292663772",
                "Леший +375296557771",
                "Кравцов +375296667222",
                "Озеров +375296668881",
                "Пуговкин +375446668771",
                "Кукуля +375336667721",
                "Пушкин +375296666111",
                "Озеров +375296667321",
                "Хмельнов +375335567321",
                "Иванов +79012345605"
        };
    }
}