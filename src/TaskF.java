import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        if (n >= 3) {
            int left = scanner.nextInt();
            int middle = scanner.nextInt();

            for (int i = 2; i < n; i++) {
                int right = scanner.nextInt();

                if (middle > left && middle > right) {
                    count++;
                }

                left = middle;
                middle = right;
            }
        }

        System.out.println(count);
    }
}