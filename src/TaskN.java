import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        int shift = Math.floorMod(k, n);

        reverse(array, 0, n - 1);
        reverse(array, 0, shift - 1);
        reverse(array, shift, n - 1);

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