import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputOne = scanner.nextInt();
        int inputTwo = scanner.nextInt();
        for (int i = inputOne; i < inputTwo + 1; i++) {
            System.out.println(i);
        }
    }
}
