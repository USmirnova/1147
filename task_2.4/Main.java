/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно.
Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Начальный взнос: ");
    Double contribution = scan.nextDouble(); // начальный взнос
    System.out.println("Ежегодный процент: ");
    Double percent = scan.nextDouble();// ежегодный процент
    Double ci = (1+(percent/100)); //compound interest (часть формулы сложного процента)
    int year = 5; // периуд
    //формула из интернета: конечная сумма = ((1+(процент/10)) в степени количества периодов=5лет)*начальный взнос
    for (int i=0; i<year; i++) {
      contribution = contribution*ci;
      System.out.println("Ваш вклад за "+(i+1)+"_й год: "+contribution);
    }

  }
}
