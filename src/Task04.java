import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputOne = scanner.nextInt();
        int inputTwo = scanner.nextInt();
        int sum = 0;
        int medium = 0;
        int count = 0;
        for (int i = inputOne; i < inputTwo + 1; i++) {
            sum += i;
            count++;
        }
        System.out.printf("Сумма %d, среднее %d", sum, sum / count );
    }
}
