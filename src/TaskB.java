import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();

            if (value % 2 == 0) {
                if (result.length() > 0) {
                    result.append(' ');
                }
                result.append(value);
            }
        }

        System.out.println(result);
    }
}