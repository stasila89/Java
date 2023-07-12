package ru.Piskovski.HW2;

import ru.Piskovski.Utilities;


public class Exercise6 {
    public static void main(String[] args) {
        task3();

    }

    public static void task3(){
        String jsonString = Utilities.readFirstLineFile("students.json");

        System.out.println("\nИсходная json-строка:");
        System.out.println(jsonString);

        StringBuilder[] result = parseJson(jsonString);

        System.out.println("\nВывод результата:");
        Utilities.printArrayStringBuilder(result);
    }

    private static StringBuilder[] parseJson(String jsonString) {
        int size =Utilities.stringCountChar(jsonString,'}');
        StringBuilder[] result = new StringBuilder[size];
        int i = 0;
        int colons = 0;
        int quotes = 0;
        for (int j = 0; j < jsonString.length(); j++) {
            char ch = jsonString.charAt(j);
            if (ch == '{'){
                result[i] = new StringBuilder("Студент ");
            } else if (ch == '}'){
                result[i].append(".");
                i++;
                colons = 0;
            } else if (ch == ':'){
                colons++;
                if (colons == 2){
                    result[i].append(" получил ");
                } else if (colons == 3){
                    result[i].append(" по предмету ");
                }
                quotes = 0;
            } else if (ch == '"' && colons > 0){
                quotes++;
            } else if (quotes == 1){
                result[i].append(ch);
            }
        }
        return result;
    }
}
