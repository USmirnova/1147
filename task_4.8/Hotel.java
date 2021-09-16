public class Hotel {
	Room[] rooms;

	public Hotel(Room[] rooms) {
		this.rooms = rooms;
	}

	public void getRoom(byte roomNumber) {
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i].getRoomNumber()==roomNumber) {
				System.out.print("Свойства комнаты №"+rooms[i].getRoomNumber()+": "
						+"Спальных мест:"+rooms[i].getQuantity()+"; "
						+"Wc:"+rooms[i].isWc()+"; "
						+"Eat:"+rooms[i].isEat()+"; "
						+"Wifi:"+rooms[i].isWifi()+"; "
						+"isFree:"+rooms[i].isFree()+". \n"
				);
			}
		}
	}

	public void getFreeRooms(){
		String freeRoomsList = "";
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i].isFree()) freeRoomsList += rooms[i].getRoomNumber()+", ";
		}
		System.out.println("Номера свободных комнат "+freeRoomsList);
	}
	public void getReservedRooms(){
		String reservedRoomsList = "";
		for (int i = 0; i < rooms.length; i++) {
			if (!rooms[i].isFree()) reservedRoomsList += rooms[i].getRoomNumber()+", ";
		}
		System.out.println("Номера зарезервированных комнат "+reservedRoomsList);
	}
	public void selectOfParam(String param) {
		String[] splitted = param.split(" "); // разобъем ее на элементы массива
		String info = "Вашему запросу соответствуют комнаты: ";
		byte quantity = 0;
		boolean wc = false;
		boolean eat = false;
		boolean wifi = false;
		boolean isFree = false;

		for (int i = 0; i < splitted.length; i++) {
			if (splitted[i].indexOf("quantity:")==0) {byte number = (byte)Integer.parseInt(splitted[i].substring(9,splitted[i].length()));
				if (number>0) { quantity=number;}
			}
			else if (splitted[i].equals("wc")) wc = true;
			else if (splitted[i].equals("eat")) eat = true;
			else if (splitted[i].equals("wifi")) wifi = true;
			else if (splitted[i].equals("isfree")) isFree = true;
			//System.out.println(quantity+" "+wc+" "+eat+" "+wifi+" "+isFree+" "+splitted.length);
		}

		for (int i = 0; i < rooms.length; i++) {
			byte score = 0; // для подсчета очков
			if (rooms[i].getQuantity() == quantity) score++;
			if (rooms[i].isWc() && wc) score++;
			if (rooms[i].isEat() && eat) score++;
			if (rooms[i].isWifi() && wifi) score++;
			if (rooms[i].isFree() && isFree) score++;
			if (splitted.length == score && rooms[i].isFree())  info += rooms[i].getRoomNumber()+" ";
			//System.out.println(rooms[i].getQuantity()+" "+rooms[i].isWc()+" "+rooms[i].isEat()+" "+rooms[i].isWifi()+" "+rooms[i].isFree()+" length: "+splitted.length+" score "+score+" #"+rooms[i].getRoomNumber()+" "+info);
		}
		//if (info.length()==38) info = "Вашему запросу не соответствует ни одна комната"; // плохое решение
		if (info.equals("Вашему запросу соответствуют комнаты: ")) info = "Вашему запросу не соответствует ни одна комната."; // это получше
		System.out.println(info);
	}
	public void reserveRoom(byte roomNumber) {
		String info = "Такой комнаты не существует";
		for (int i = 0; i < rooms.length; i++) {
			Room room = rooms[i];
			if(room.getRoomNumber() == roomNumber && room.isFree()){
				room.setFree(false);
				info = ("Комната номер "+roomNumber+" успешно забронированна");
				break;
			}else if(room.getRoomNumber() == roomNumber && !room.isFree()){
				info = "Комната "+roomNumber+" занята";
				break;
			}
		}
		System.out.println(info);
	}
	public void checkoutRoom(byte roomNumber) {
		String info = "Такой комнаты не существует";
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i].getRoomNumber()==roomNumber && !rooms[i].isFree()) {
				rooms[i].setFree(true);
				info = ("Комната номер "+roomNumber+" освобождена");
				break;
			}
			else if (rooms[i].getRoomNumber()==roomNumber && rooms[i].isFree()) {
				info = "Комната "+roomNumber+" не занята.";
				break;
			}
		}
		System.out.println(info);
	}
}
