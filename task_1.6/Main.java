import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        double result = number+(0.15*number);
        System.out.println(result);
    }
}
