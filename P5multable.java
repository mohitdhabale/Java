import java.util.Scanner;

public class P5multable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number (Table to be calculated): ");
        int number = scanner.nextInt();

        System.out.print("Input number of terms: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
}
