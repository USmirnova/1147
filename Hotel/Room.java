public class Room { //класс Room будет создавать в Main обекты типа Room и запихивать в массив.
	private boolean wc; // наличие санузла
	private int sleepingPlace; // количество спальных мест
	private boolean conditioner; // наличие кондиционера
	private boolean wifi; // наличие wifi
	private int roomNumber; // номер комнаты
	private boolean reserved; // зарезервирована // изначально будет false

	// вызываем конструктор - метод, назначающий значения этим свойствам при создании объекта
	public Room(boolean wc, int sleepingPlace, boolean conditioner, boolean wifi, int roomNumber) {// reserved не принимаю при создании объекта, т.к. изначально они все свободны.
		this.wc = wc;
		this.sleepingPlace = sleepingPlace;
		this.conditioner = conditioner;
		this.wifi = wifi;
		this.roomNumber = roomNumber;
		this.reserved = false; // изначально все комнаты не зарезервированы
	}
	// единственный сеттер.
	public void setReserved(boolean reserved) {// потому, что только reserved будет меняться
		this.reserved = reserved;
	}
	// геттеры на все атрибуты
	public boolean isWc() {// перед булевыми переменными вместо get будет is
		return wc; // лучше писать return this.wc // в автоматическом режиме не всегда устанавливается this
	}
	public int getSleepingPlace() {
		return sleepingPlace; //this.
	}
	public boolean isConditioner() {
		return conditioner; //this.
	}
	public boolean isWifi() {
		return wifi; //this.
	}
	public int getRoomNumber() {
		return roomNumber; //this.
	}
	public boolean isReserved() {
		return reserved; //this.
	}

}
