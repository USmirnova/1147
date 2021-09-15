/*
Реализуй в классе Fox интерфейс Animal.
Учти, что создавать дополнительные классы и удалять методы нельзя!
Требования:
•	Интерфейс Animal должен быть реализован в классе Fox.
•	В интерфейсе Animal нужно объявить метод getColor.
•	Дополнительные классы или интерфейсы создавать нельзя.
*/

public class Main {
    public static void main(String[] args) {
        Fox patrikeevna = new Fox();
        System.out.print("Animal: "+patrikeevna.getName()+"; Color: ");
        patrikeevna.getColor();
    }
}

interface Animal {
    void getColor();
}

class Fox implements Animal {
    public String getName() {return "Fox";}
    public void getColor() {System.out.println("red");}
}
