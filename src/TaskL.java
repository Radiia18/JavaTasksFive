import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        int petyaHeight = scanner.nextInt();
        int position = 1;

        for (int height : heights) {
            if (height >= petyaHeight) {
                position++;
            }
        }

        System.out.println(position);
    }
}