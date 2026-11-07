import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (scanner.nextInt() > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}