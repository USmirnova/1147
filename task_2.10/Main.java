/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
  public static void main(String[] args) {
    int arr[] = {34, 38, 2, 90, 01, 77, 13, 88, 34, 93, 93};
    String check = "Нет.";
    for (int i = 0; i < arr.length-1; i++) {
      System.out.println(arr[i]+" и "+arr[i+1]);
      if(arr[i]==arr[i+1]) {
        check = "Да.";
      }
    }
    System.out.println(check);
  }
}
