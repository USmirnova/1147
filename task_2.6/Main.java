/*
Задание: Даны переменные a и b.
Проверьте, что a делится без остатка на b.
Если это так - выведите 'Делится' и результат деления,
иначе выведите 'Делится с остатком' и остаток от деления.
*/


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите переменную a: ");
    Double a = scan.nextDouble();
    System.out.println("Введите переменную b: ");
    Double b = scan.nextDouble();
    Double remainder = a%b;
    if (remainder == 0) {
      System.out.println("Делится. Результат: "+a/b);
    }
    else {
      System.out.println("Делится с остатком: "+remainder);
    }


  }
}
