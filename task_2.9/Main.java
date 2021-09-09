/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
  public static void main(String[] args) {
    int arr[] = {2, 3, 4, -5, 8};
    String check = "Нет";
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 5) check = "Да";
    }
    System.out.println(check);
  }
}
