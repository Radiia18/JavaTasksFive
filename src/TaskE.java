import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int previous = scanner.nextInt();
        boolean found = false;

        for (int i = 1; i < n; i++) {
            int current = scanner.nextInt();

            if ((previous > 0) == (current > 0)) {
                found = true;
            }

            previous = current;
        }

        System.out.println(found ? "YES" : "NO");
    }
}