/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/
public class Main {
	public static void main(String[] args) {
		Horse mustang = new Horse(true, "Игого", (byte) 4, "Рысак", "Белый");
		mustang.eat(); // для объекта класса horse вызвали метод класса Animal
		mustang.run();
		Pegasus ares = new Pegasus(true, "Игого", (byte) 4, "Рысак", "Белый");
		ares.fly();
		ares.eat();
	}
}
