import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int maximum = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            int value = scanner.nextInt();
            if (value > maximum) {
                maximum = value;
            }
        }

        System.out.println(maximum);
    }
}