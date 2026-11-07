import java.util.Scanner;

public class TaskK{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        int previous = 0;

        for (int i = 0; i < n; i++) {
            int current = scanner.nextInt();

            if (i == 0 || current != previous) {
                count++;
            }

            previous = current;
        }

        System.out.println(count);
    }
}