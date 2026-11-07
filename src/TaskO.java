import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] colors = new int[n];

        for (int i = 0; i < n; i++) {
            colors[i] = scanner.nextInt();
        }

        int destroyed = 0;
        int left = 0;

        while (left < n) {
            int right = left + 1;

            while (right < n && colors[right] == colors[left]) {
                right++;
            }

            if (right - left >= 3) {
                destroyed += right - left;
            }

            left = right;
        }

        System.out.println(destroyed);
    }
}