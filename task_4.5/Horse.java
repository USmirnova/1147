public class Horse extends Animal { // наследуем от Animal
	String breed; // дополнительный атрибут
	String color; // дополнительный атрибут + к атрибутам Animal
	public Horse(boolean veg, String speak, byte paws, String breed, String color) {
		super(veg, speak, paws); // вызываем конструктор родительского класса
		this.breed = breed; // добавляем атрибуты этого класса Horse
		this.color = color;
	}
	public void run() { System.out.println("Игого, я поскакал(а)"); }
}
