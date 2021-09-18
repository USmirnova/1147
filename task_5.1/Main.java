/*
 * Дана коллекция имён.
 * 1) удалить все повторяющиеся имена из коллекции
 * 2) вывести коллекцию на экран
 * */

import java.util.ArrayList;
import java.util.Scanner; //?

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //? задачу надо решить применяя scanner?
        ArrayList<String> names = new ArrayList();
        names.add("Анатолий");
        names.add("Георгий");
        names.add("Руслан");
        names.add("Георгий");
        names.add("Павел");
        names.add("Руслан");
        System.out.println(names);

        for (int i = 0; i < names.size(); i++) {
            int count = 0;
            for (int j = 0; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j))) {
                    count++;
                    if (count==2) {
                        names.remove(i);
                        break;
                    }
                }
            }
        }
        System.out.println("-------");
        System.out.println(names);
    }
}
