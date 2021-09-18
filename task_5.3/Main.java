/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа,
 * которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> collNums = new ArrayList<Integer>();
		ArrayList<Integer> newCollNums = new ArrayList<Integer>();
		for (int i = 0; i <= 20; i++) {
			collNums.add(numRandom());
			if (collNums.get(i) >0 && collNums.get(i)< 10) {
				newCollNums.add(collNums.get(i));
			}
		}
		System.out.println("Дано: "+collNums);
		System.out.println("Новая коллекция: "+newCollNums);
	}// main
	public static int numRandom() {
		return (int) (Math.random()*20-5);
	}
} //Main
