import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputOne = scanner.nextInt();
        int inputTwo = scanner.nextInt();
        for (int i = inputOne; i < inputTwo; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 3 != 0 & i % 5 != 0) {
                System.out.println(i);
            }
        }
    }
}
