import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        if (n > 0) {
            int previous = scanner.nextInt();

            for (int i = 1; i < n; i++) {
                int current = scanner.nextInt();

                if (current > previous) {
                    count++;
                }

                previous = current;
            }
        }

        System.out.println(count);
    }
}