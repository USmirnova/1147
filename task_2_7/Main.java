/*
Задание: Дано число, например 31.
Проверьте, что это число не делится ни на одно другое число кроме себя самого и единицы.
То есть в нашем случае нужно проверить, что
число 31 не делится на все числа от 2 до 30.
Если число не делится - выведите 'false', а если делится - выведите 'true'.
*/


import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Введите составное число: ");
  int number = scan.nextInt();
  boolean check = false;

  for (int i=2; i<number; i++) {
    if (number%i == 0) {
      check = true;
    }
  }
  System.out.println(check);
  if (check == true) {
    System.out.println("Число "+number+" делится на:");
    for (int i=2; i<number; i++) {
      if (number%i == 0) {
        System.out.println(number/i);
      }
    }
  }
  else {
    System.out.println("Число "+number+" является простым, т.к. делится только на себя и на 1.");
  }

}
}
