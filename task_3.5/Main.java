/*
Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/
public class Main {
	public static void main(String[] args) {
		int num[] = {4,2,6,2,65};
		outputSequence(num.length, num);
	}
	public static void outputSequence(int n, int num[]) {
		if (n > 0) {
			System.out.println(num[-1*(n-5)]);
			outputSequence(n-1, num);
		}

	}
}
