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
        System.out.println(min(1, 2, 3));    // 1
        System.out.println(min(-1, -2, -3)); // -3
        System.out.println(min(3, 5, 3));    // 3
        System.out.println(min(5, 5, 10));   // 5
        /*
        // --- для проверки всех условий
        System.out.println(min(1, 1, 1)); // 1 //все равны

        System.out.println(min(1, 1, 9)); // 1 // равны 2 из 3
        System.out.println(min(9, 9, 1)); // 1
        System.out.println(min(1, 9, 9)); // 1
        System.out.println(min(9, 9, 1)); // 1
        System.out.println(min(1, 9, 1)); // 1
        System.out.println(min(9, 1, 9)); // 1

        System.out.println(min(1, 2, 3)); // 1 // все не равны
        System.out.println(min(3, 1, 2)); // 1 // все не равны
        System.out.println(min(2, 3, 1)); // 1 // все не равны
         */
    }

    public static int min(int a, int b, int c) {
        int error = (int) (-1/0.0); // проверка на неучтенное условие

        if (a==b && b==c) return a; // все равны
        else if (a==b && a < c ) return a;
        else if (a==b && a > c ) return c;
        else if (b==c && a < c ) return a;
        else if (b==c && a > c ) return c;
        else if (a==c && a < b ) return a;
        else if (a==c && a > b ) return b;
        else if (a!=b && b != c && a!=c) { // все не равны
            if (a < b && a < c) return a;
            else if (b < a && b < c) return b;
            else if (c < a && c < b) return c;
            else return error; // проверка на неучтенное условие
        }
        else return error; // проверка на неучтенное условие
    }


}
