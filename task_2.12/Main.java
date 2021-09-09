/*
ВНИМАНИЕ эта задача для ДЗ и не является обязательной.
Задание:
1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("заполним массив из 10 чисел");

    int [] arr = new int[10]; // вводим с клавы
    int [] sizes = new int[9]; // вспомогательный массив длинн
    int currentLength = 1; // текущая длина последовательности

    //----------------------------------- creating an array of number
    for (int i = 0; i <10 ; i++) {
      System.out.println("Введите "+(i+1)+"_ое число: ");
      arr[i]=scan.nextInt();
    }

    System.out.print("Создали массив чисел: [ ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println("]");

    //----------------------------------- creating an auxiliary array
    for (int i = 0; i < arr.length-1; i++) {
      if (arr[i]!=arr[i+1]) {
        currentLength = 1;
      }
      else {
        currentLength++;
      }
      sizes[i] = currentLength;
    }

    System.out.print("Вспомогательный массив текущих длинн: [ ");
    for (int i = 0; i < sizes.length; i++) {
      System.out.print(sizes[i]+" ");
    }
    System.out.println("]");

    //----------------------------------- max length
    int max = 0;
    for (int i = 0; i < sizes.length; i++) {
      if (max<sizes[i]) max=sizes[i];
    }

    System.out.println("Длина наибольшей последовательности: "+max);
  }
}
