/* 
Задача, доработать код с вебинара

Составить генеалогическое древо. У вас должно быть 2 бабушки, 2 дедушки, мама, папа, ребёнок.
Для всех персонажей должен корректно работать метод info()
На экран должно попасть максимум информации.
т.е. для ребенка нужно вывести инфо о родителях, а так же о бабушках и дедушках.
Задачу сдать как task_4.9

В нашей вселенной, возраст человека не может превышать 120лет
У персонажа есть здоровье, оно не может быть больше 100ед.
*/

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ольга", "Иванова", 70, null,null);
        Person person1b = new Person("Андрей", "Иванов", 72, null,null);
        Person person2a = new Person("Елизавета", "Петрова", 66, null, null);
        Person person2 = new Person("Николай", "Петров", 68, null, null);
        Person person3 = new Person("Иван", "Иванов", 38, person1, person1b);
        Person person4 = new Person("Ирина", "Иванова", 35, person2a, person2);
        Person person5 = new Person("Василий", "Иванов", 12, person4, person3);

        person5.info();
    }
}

class Person {
    private String name;
    private String lastname;
    private int age;
    private int hp;
    private Person mother;
    private Person father;
    Person(String name, String lastname, int age, Person mother, Person father){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.hp = 100;
        this.mother = mother;
        this.father = father;
    }

    void info() {
        String info =   "Меня зовут "+this.name+"\n";

        if(this.mother != null){
            info += "Мою маму зовут "+this.mother.name+"\n";
            if(this.mother.father != null){
                info += "Моего дедушку по маминой линии зовут "+this.mother.father.name+"\n";
            }
            if(this.mother.mother != null){
                info += "Мою бабушка по маминой линии зовут "+this.mother.mother.name+"\n";
            }
        }
        if(this.father != null){
            info += "Моего отца зовут "+this.father.name+"\n";
            if(this.father.father != null){
                info += "Моего дедушку по папиной линии зовут "+this.father.father.name+"\n";
            }
            if(this.father.mother != null){
                info += "Мою бабушку по папиной линии зовут "+this.father.mother.name+"\n";
            }
        }

        System.out.println(info);
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    String getName(){
        return this.name;
    }
    String getLastname(){
        return this.lastname;
    }
    int getAge(){
        return this.age;
    }
    int getHp(){
        return this.hp;
    }
    void setAge(int age){
        if(this.age+age>120) this.age = 120;
        else this.age = this.age+age;
    }
    void setHp(int hp){
        if(this.hp+hp>100) this.hp = 100;
        else this.hp = this.hp+hp;
    }
    void sayHi(String name){
        System.out.println("Привет "+name+", меня зовут "+this.name);
    }
}
