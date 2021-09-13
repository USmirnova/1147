/*
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, по вашему усмотрению
Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/
public class Main {
    public static void main(String[] args) {
        Cat butch = new Cat(8, 8, 8);
        Cat shustric = new Cat(8, 9, 8);
        //System.out.println(butch.info()); // для наглядности
        //System.out.println(shustric.info()); // для наглядности
        System.out.println(butch.fight(shustric));
        System.out.println(shustric.fight(butch));
    }
}

class Cat { // без параметров
    public int age; // это параметры. Они пусты. Будут задаваться конструктором
    public int weight;
    public int strength;

    public Cat(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public String info() { // этот метод просто для наглядности
        return "Возраст: "+this.age+" Масса: "+this.weight+" Сила: "+this.strength;
    }

    public boolean fight(Cat anotherCat) { // если ничья return false
        int scoreCat = 0;
        int scorAnoter = 0;

        if (this.age > anotherCat.age) scoreCat++;
        else if (this.age < anotherCat.age) scorAnoter++;

        if (this.weight > anotherCat.weight) scoreCat++;
        else if (this.weight < anotherCat.weight) scorAnoter++;

        if (this.strength > anotherCat.strength) scoreCat++;
        else if (this.strength < anotherCat.strength) scorAnoter++;

        System.out.print("Счет: ");
        System.out.print(scoreCat);
        System.out.print(" : ");
        System.out.println(scorAnoter);

        if(scoreCat>scorAnoter) return true;
        else return false;
    }
}
