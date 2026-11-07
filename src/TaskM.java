import java.util.Scanner;

public class TaskM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt() - 1;
        int b = scanner.nextInt() - 1;
        int c = scanner.nextInt() - 1;
        int d = scanner.nextInt() - 1;

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }

        reverse(array, a, b);
        reverse(array, c, d);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                result.append(' ');
            }
            result.append(array[i]);
        }

        System.out.println(result);
    }

    private static void reverse(int[] array, int left, int right) {
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}