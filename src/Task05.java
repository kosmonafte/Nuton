import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputOne = scanner.nextInt();
        int fact = 1;
        for (int i = inputOne; i > 0; i--) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
