import java.util.Scanner;

public class P3sumavg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.print("Input the 5 numbers : ");
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            sum += num;
        }

        double avg = (double) sum / 5;

        System.out.println("The sum of 5 no is : " + sum);
        System.out.println("The Average is : " + avg);
    }
}
