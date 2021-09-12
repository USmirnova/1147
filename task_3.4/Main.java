/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если их сумма больше 10 - пусть функция вернет true, а если нет - false.
*/
public class Main {
	public static void main(String[] args) {
		System.out.println(truthСheck(2, 8));
	}
	public static boolean truthСheck(int a, int b) {
		return ((a+b)>10);
	}
}
