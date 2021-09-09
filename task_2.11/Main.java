/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/

public class Main {
  public static void main(String[] args) {
    int arr[] = {3, 0, 2, 4, 1, 1, 0, 3, 4, 2, 5};
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum +=arr[i];
      if(sum>10) {
        System.out.println(i+1);
        break;
      }
    }

  }
}
