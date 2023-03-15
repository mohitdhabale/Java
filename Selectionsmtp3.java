import java.util.Scanner;

public class Selectionsmtp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double CP, Dis, Fp;
        String user;

        System.out.print("Enter cost price: ");
        CP = sc.nextDouble();

        System.out.print("Are you a student? (Y/N): ");
        user = sc.next();

        if (user==("Y")) {
            if (CP > 500) {
                Dis = CP * 0.1;
            } else {
                Dis = CP * 0.05;
            }
        } else {
            if (CP > 500) {
                Dis = CP * 0.08;
            } else {
                Dis = CP * 0.02;
            }
        }

        Fp = CP - Dis;        
        System.out.println("Discount: " + Dis);
        System.out.println("Final price: " + Fp);
    }
}
