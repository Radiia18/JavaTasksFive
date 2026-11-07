import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        if (n > 0) {
            int last = array[n - 1];

            for (int i = n - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }

            array[0] = last;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                result.append(' ');
            }
            result.append(array[i]);
        }

        System.out.println(result);
    }
}