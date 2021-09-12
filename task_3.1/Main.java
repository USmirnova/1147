/* Написать функцию, которая вычисляет минимум из трёх чисел.
Требования:
•	Программа должна выводить текст на экран.
•	Метод min не должен выводить текст на экран.
•	Метод main должен вызвать метод min четыре раза.
•	Метод main должен выводить на экран результат работы метода min. Каждый раз с новой строки.
•	Метод min должен возвращать минимальное значение из чисел a, b и с.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(min3n(1, 2, 3)); // 1
        System.out.println(min3n(-1, -2, -3)); //-3
        System.out.println(min3n(3, 5, 3)); //3
        System.out.println(min3n(5, 5, 10)); // 5
    }
    public static int min3n(int a, int b, int c) {
        return min2n(min2n(a,b),min2n(b,c));
    }
    public static int min2n(int a, int b) {
        if (a<b) return a;
        else return b; // (a>b) || (a==b)
    }

}
