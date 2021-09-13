public abstract class Animal {
	boolean vegetarian; // травоядное
	String speak; // звуки издает
	byte paws; // лапы

	public Animal(boolean veg, String speak, byte paws) {
		this.vegetarian = veg;
		this.speak = speak;
		this.paws = paws;
	}
	boolean isVegetarian() {return this.vegetarian;}
	String getSpeak() {return this.speak;}
	byte getPaws() {return this.paws;}
	void eat() { // общий для всех метод
		System.out.println("Я кушаю");
	}
}
