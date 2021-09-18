/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
Модернизация ПО
*/

public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Map<String, String> dataCollection = new HashMap();
    System.out.println("Введите несколько пар \"город фамилия\" через проебл. \n"
        + "Или Enter для завершения ввода данных:  ");
    while (true) {
        String dataLine = scanner.nextLine();
        if (dataLine.isEmpty()) {
            break;
        }
        String[] arr = dataLine.split(" ");
        if (arr.length==2) {
            String country = arr[0];
            String family = arr[1];
            dataCollection.put(country,family);
        }
        else {
            System.out.println("Не правильный формат, попробуйте еще раз: ");
        }
        //System.out.println(dataCollection); // что попадает в коллекцию
        System.out.println("Введите фамилию и город через пробел:  ");
    }

    //metka:
    System.out.println("Введите город из списка :\n"+dataCollection.keySet());
    String countryName = scanner.nextLine();
    if (dataCollection.containsKey(countryName)) {
        System.out.println("В городе "+countryName+" проживают: "+dataCollection.get(countryName));
        //continue metka; //не поняла как с метками перехода работать ((

    }
    else {
        System.out.println("В списке такого города нет. Проверьте правильность написания.");
    }

}}
