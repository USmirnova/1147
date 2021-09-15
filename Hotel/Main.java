import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); //объявляем scanner типа Scanner
	Hotel hotel = new Hotel(new Room[]{ //создаем объект hotel типа Hotel
			//и аргументы - массив из объектов комнат. // Параметры сами задаем
			new Room(false, 1, false, false, 11),
			new Room(false, 3, true, false, 12),
			new Room(false, 2, true, true, 13),
			new Room(true, 1, false, false, 14),
			new Room(true, 4, true, true, 15),
			new Room(true, 3, false, false, 16),
			new Room(false, 3, false, false, 17),
			new Room(true, 4, true, false, 18),
			new Room(true, 44, true, true, 19),
			new Room(true, 1, false, false, 20),
			new Room(false, 1,false,false,21),
			new Room(true, 4, true, true, 22)
	});

	String help = "*----*\n" +
			"getFreeRooms getFreeRooms conditioner wifi wc sleepingPlace:4 - показать все свободные комнаты\n" +
			"reserve [номер комнаты] - забронировать комнату\n" +
			"getReservedRooms - показать забронированные комнаты\n" +
			"exit - выход из программы\n" +
			"help - вывод подсказки по командам\n" +
			"*----*";
	System.out.println(help);
	System.out.println("Введите команду: ");
	String command = scanner.nextLine();
	while (!command.equals("exit")) { //бесконечный цикл завершится при вводе "exit" в консоль //getFreeRooms wc:true sleepingPlace:4
		if(command.indexOf("getFreeRooms") == 0) { // если началом строки является подстрока getFreeRooms
			String[] splitted = command.split(" "); // разобъем ее на элементы массива
			if (splitted.length == 1) hotel.getFreeRooms(); // если длина этого массива всего 1 элемент, то вызываем метод hotel.getFreeRooms()
			else { // а если эта строка содержит и другие параметры // splitted = [getFreeRooms] [wc] [wifi] [sleepingPlace:4]
				//создадим переменные с аналогичными именами и присвоим им начальные значения.
				//getFreeRooms wc wifi sleepingPlace:44 //31
				boolean wc = false;
				int sleepingPlace = 0;
				boolean conditioner = false;
				boolean wifi = false;
				for (int i = 1; i < splitted.length; i++) {// переберем массив желаемых параметров // splitted = [getFreeRooms] [wc] [wifi] [sleepingPlace:4]

					if(splitted[i].equals("wc")) wc = true; //вспомогательная переменная (в.п) wc=введенное значение
					else if(splitted[i].indexOf("sleepingPlace:")==0) sleepingPlace = Integer.parseInt(splitted[i].substring(14,splitted[i].length())); //в.п= преобразованный в число диапазон конечных после : символов
					else if(splitted[i].equals("conditioner")) conditioner = true; // в.п conditioner= что ввели
					else if(splitted[i].equals("wifi")) wifi = true;// в.п wifi= что ввели
				}
				System.out.println(wc+" "+sleepingPlace+" "+conditioner+" "+wifi+" "+(splitted.length-1));
				hotel.getFreeRooms(wc, sleepingPlace, conditioner, wifi, splitted.length-1); // вызываем перегруженый метод getFreeRooms и передаем в него нужные параметры
			}
		}
		else if (command.indexOf("reserve") == 0) { // если команда начинается на подстроку reserve
			String[] splitted = command.split(" "); // {"reserve", "32"} // делим ее на элементы массива
			int roomNumber = Integer.parseInt(splitted[1]); // номер комнаты приобразовываем в число и записываем в в.п. roomNumber
			hotel.reserve(roomNumber); // вызываем метод, резервирующий данный номер комнаты
		}
		else if(command.equals("getReservedRooms")) { // если команда является getReservedRooms
			hotel.getReservedRooms(); // вызываем метод, показывающий список забронированных номеров
		}
		else if(command.equals("help")) {// если введена команда help
			System.out.println(help); // вызываем метод-подсказку
		}
		else { // если введено иное слово, выводим сообщение об ошибке
			System.out.println("Ошибка: неизвестная команда, для получения списка команд, введите help");
		}
		System.out.println("\nВведите команду: "); // запрашиваем ввод следующей команды
		command = scanner.nextLine(); // записываем введенные данные в переменную command, т.е. переопределяем ее.
	}
}
}
