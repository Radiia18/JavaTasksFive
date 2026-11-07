import java.util.Scanner;

public class TaskH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i + 1 < n; i += 2) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
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