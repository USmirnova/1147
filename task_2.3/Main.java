/*
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
*/

public class Main {
  public static void main(String[] args) {
    int figure = 8;
    int lenth = 10;
    int count = 1;
    for (int i=0; i<lenth; i++) {
      for (int j=0; j<count; j++) {
        System.out.print(figure+" ");
      }
      System.out.println();
      count++;
    }

  }
}
