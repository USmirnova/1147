public class Hotel { // класс отель
	Room[] rooms; // rooms - массив типа Room // Room rooms[]; // в нем разместим комнаты

	public Hotel(Room[] rooms) { //конструктор Alt+Insert // при создании объекта отеля
		this.rooms = rooms; //будем передавать в него массив комнат
	}

	public void getFreeRooms() { //ПолучитьСвободныеКомнаты
		String result = "Список свободных комнат: ";// строка для вывода результата
		for (int i = 0; i < rooms.length; i++) {// перебираем массив
			Room room = rooms[i]; //создаем промежуточную переменную и запихиваем в нее текущую комнату
			// у текущей комнаты вызываем метод (get-метод, созданный в Room.java)
			//он показывает true/false. Комната свободна это false, но чтобы условие при этом было true инвертируем
			if(!room.isReserved()) result +=  room.getRoomNumber()+" "; // дописываем в строку номер пустой комнаты
		}
		System.out.print(result); // печатаем строку в консоль
	}
	//перегрузка метода - метод с тем же именем, но в который передаются параметры, в отличае от предыдущего //getFreeRooms
	public void getFreeRooms(boolean wc, int sleepingPlace, boolean conditioner, boolean wifi, int serviceCount) { //вводим желаемые параметры комнаты + к-во этих параметров
		String result = "По данному запросу найдены комнаты: "; // исходный результат
		for (int i = 0; i < rooms.length; i++) {
			int mark = 0; // количество введенных параметров
			Room room = rooms[i]; // чтобы не писать rooms[i]
			if(wc && room.isWc()) mark++; //количество ++ если задан такой параметр и у текущей комнаты он true
			if(sleepingPlace!=0 && room.getSleepingPlace() == sleepingPlace) mark++; // если комнаты важны и желаемое к-во == таковому в данной комнате
			if(conditioner && room.isConditioner()) mark++; //++ если желаем и имеем кондиционер в данной комнате
			if (wifi && room.isWifi()) mark++; //++ если желаем и имеем wifi в данной комнате
			if(serviceCount == mark && !room.isReserved()) { // если к-во параметров совпадает и данная комната не зарезервирована
				result += room.getRoomNumber()+" "; // добавляем к исходной строке номер данной комнаты
			}
		}
		System.out.println(result); // выводим результирующую строку
	}

	public void reserve(int roomNumber) { // метод бронирования // вводим номер комнаты
		String result = "Ошибка: номер не существует"; // исходная строка результата
		for (int i = 0; i < rooms.length; i++) {
			Room room = rooms[i]; // для удобства, чтобы не писать rooms[i]
			if(room.getRoomNumber() == roomNumber && !room.isReserved()){// текущий №=переданному и комната при этом не зарезервирована
				result = "Номер "+roomNumber+" успешно забронирован"; // переопределяем строку
				room.setReserved(true); // устанавливаем новое значение в объект данной комнаты
				break; // и выходим из цикла
			}
			else if(room.getRoomNumber() == roomNumber && room.isReserved()) { // данная комната уже занята
				result = "Номер "+roomNumber+" занят"; // сообщаем это
				break; // и выходим из цикла
			}
		}
		System.out.println(result); // выводим строку с соответствующим сообщением
	}
	// Метод вывода списка зарезервированных номеров
	public void getReservedRooms() {
		String result = "Зарезервированные комнаты: "; // исходная строка
		for (int i = 0; i < rooms.length; i++) {
			Room room = rooms[i];
			if(room.isReserved()) {// есди комната забронирована
				result += room.getRoomNumber()+" ";// добавляем ее номер к исходной строке
			}
		}
		System.out.println(result); // выводим результат: строка с комнатами.
	}

}
