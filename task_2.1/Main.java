/*
не очень поняла задание.
Можно ли дублировать слова во фразах?
Например:
МамаМамаМама
МамаМамаМыла
МамаМамаРаму
МамаМылаМама
МамаМылаМыла
МамаМылаРаму
МамаРамуМама
МамаРамуМыла
МамаРамуРаму

Тогда получится 27 уникальных фраз, но с повторяющимися словами.

Оставляю вариант из 6ти комбинаций, без повтора слов. 
Еслми он не верный, то считайте, что строки 28 и 32 закоментированы ))
*/
public class Main {
    public static void main(String[] args) {
      String arr[] = {"Мама", "Мыла", "Раму"};
      int count = 0;
      for (int i=0; i<arr.length; i++) {
        for (int j=0; j<arr.length; j++) {
          for (int k=0; k<arr.length; k++) {
            if ((arr[i] != arr[j]) && (arr[j] != arr[k]) && (arr[k] !=arr[i])) {
              System.out.print(arr[i]+arr[j]+arr[k]);
              count++;
              System.out.println();
            }
          }
        }
      }
      System.out.println();
      System.out.println("Всего "+count+" уникальных комбинаций");


    }
}
