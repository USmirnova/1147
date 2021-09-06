import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение температуры в градусах Цельсия");
        float TC = scan.nextInt();
        float TF = 9f/5f*TC+32;
        System.out.println("Температуры в градусах Фаренгейта: "+TF);
    }
}
