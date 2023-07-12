package ru.Piskovski.HW2;

public class Exercise4 {
    public static void main(String[] args) {
        task1();
    }
    public static void task1(){

        String filter = inputFilter();

        String result = addWhere(filter);

        printResult(result);
    }

    static String inputFilter(){
        return "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
    }

    static String addWhere(String filter){

        StringBuilder sql = new StringBuilder("select * from students where ");

        String[] keyValue= new String[2];

        boolean firstCondition = true;

        for (String param : filter.replace("{", "").replace("}", "").replace("\"", "").split(",")) {

            keyValue = param.strip().split(":");

            String key = keyValue[0].strip();

            String value = keyValue[1].strip();

            if (!(value.equals("null"))){
                if (firstCondition){

                    sql.append(String.format("%s='%s'",key,value));
                    firstCondition = false;
                } else {

                    sql.append(String.format(" and %s='%s'",key,value));
                }
            }
        }

        sql.append(";");

        return sql.toString();
    }

    static void printResult(String s){
        System.out.println();
        System.out.println(s);
    }
}
