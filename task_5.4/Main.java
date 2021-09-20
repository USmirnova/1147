/* 
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/

import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите относительный путь к файлу: ");
		String path = scan.nextLine();
		try { //   src/nums.txt
			FileReader reader = new FileReader(path); //передаем в объект дискриптор файла или объект типа File
			int c;
			LinkedList<Integer> ll = new LinkedList<>();
			String n = "";
			while ((c=reader.read()) != -1) {//считываем посимвольно пока информация в файле не закончится. Тогда вернется -1
				if (c==13) continue; //возврат коретки
				else if(c==10) { // перенос строки
					ll.addLast(Integer.parseInt(n));
					n = ""; // набор символов в число обнуляем
				}
				else {
						n +=(char)c;
				}
			}
			reader.close(); // закрываем ?? уточнить
			System.out.println(ll);
			ll.sort(Integer::compareTo);
			System.out.println(ll);
			for (int i = 0; i < ll.size(); i++) {
				if (ll.get(i)%2 == 0) {
					System.out.println(ll.get(i));
				}
			}
		}catch(Exception ex) {ex.printStackTrace();}

	}// main

}
