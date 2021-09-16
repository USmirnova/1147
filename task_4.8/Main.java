import java.util.Scanner;
/*
 *  ***Гостиница***
 *  1) Гостиница
 *  2) Номера (кол-во мест(1-3), сан.узел(есть/нет), питаение(есть/нет), wifi(есть/нет), свободен/занят)
 *
 *   *Задание для лабораторной работы №4*
 *   Освободить комнату
 *   Вывести свойства комнаты
 *   Показать комнаты с WiFi
 *   Показать комнаты с WC
 *   Показать комнаты с Eat
 *   Показать комнаты по кол-ву спальных мест
 *   Отобразить список команд
 * */
public class Main {
public static void main(String[] args) {
	Room[] rooms = {//
			new Room((byte) 1,false,false,true,(byte) 11),
			new Room((byte) 2,true,true,false,(byte) 12),
			new Room((byte) 1,false,true,true,(byte) 13),
			new Room((byte) 3,true,false,false,(byte) 14),
			new Room((byte) 2,false,false,false,(byte) 15),
			new Room((byte) 3,true,true,true,(byte) 16),
			new Room((byte) 1,false,true,false,(byte) 17),
			new Room((byte) 3,true,true,false,(byte) 18),
			new Room((byte) 1,false,false,true,(byte) 19),
	};
	Hotel hotel = new Hotel(rooms);
	Scanner scanner = new Scanner(System.in);
	System.out.println("Введите команду:"); 
	String command= scanner.nextLine();
	while (!command.equals("exit")){ // заменено условие // было true
		if(command.equals("getFreeRooms")){
			hotel.getFreeRooms();
		}
		else if (command.equals("getReservedRooms")) {
			hotel.getReservedRooms();
		}
		else if (command.equals("selectOfParam")) {
			System.out.println("Введите параметры комнаты через пробел, например: quantity:3 wc eat wifi isfree");
			String param = scanner.nextLine();
			hotel.selectOfParam(param);
		}
		else if(command.equals("reserveRoom")){
			System.out.print("Введите номер комнаты для бронирования: ");
			byte roomNumber = (byte) scanner.nextInt();
			hotel.reserveRoom(roomNumber);
			command= scanner.nextLine(); // чтобы не дублировалась фраза "Введите команду:"
		}
		else if (command.equals("checkoutRoom")) {
			System.out.print("Введите номер освобождаемой комнаты: ");
			byte roomNumber = (byte) scanner.nextInt();
			hotel.checkoutRoom(roomNumber);
			command= scanner.nextLine(); // чтобы не дублировалась фраза "Введите команду:"
		}
		else if (command.equals("getRoom")) {
			System.out.print("Введите номер комнаты: ");
			byte roomNumber = (byte) scanner.nextInt();
			hotel.getRoom(roomNumber);
			command= scanner.nextLine(); // чтобы не дублировалась фраза "Введите команду:"
		}
		else if (command.equals("help")){
			System.out.print("------------------\n"+
							"getFreeRooms - свободные комнаты;\n"+
							"getReservedRooms - зарезервированные комнаты;\n"+
							"selectOfParam - подбор комнат по различным параметрам, например: quantity:3 wc eat wifi isfree ;\n"+
							"getRoom - свойства комнаты;\n"+
							"reserveRoom - бронирование комнаты;\n"+
							"checkoutRoom - освобождение комнаты;\n"+
							"help - список команд;\n"+
							"exit - выход;\n"+"------------------\n");
		}
		System.out.println("Введите команду:");
		command = scanner.nextLine();
	}

}
}
