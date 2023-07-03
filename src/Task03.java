import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputOne = scanner.nextInt();
        int inputTwo = scanner.nextInt();
        if (inputTwo < inputOne) {
            int tmp = inputOne;
            inputOne = inputTwo;
            inputTwo = tmp;
        }
        for (int i = inputOne; i < inputTwo + 1; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
