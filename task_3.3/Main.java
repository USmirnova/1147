/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если эти числа равны - пусть функция вернет true, а если не равны - false.
*/
public class Main {
	public static void main(String[] args) {
		System.out.println(checkingForEquality(5, -5));
	}
	public static boolean checkingForEquality(int a, int b) {
		return (a==b);
	}
}
