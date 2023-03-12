import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer no 1:");
        int a=sc.nextInt();

        System.out.println("Enter integer no 2:");
        int b=sc.nextInt();

        int sum=a+b;
        int sub=a-b;
        double div=a/b;
        int mul=a*b;

        System.out.println("Addition: "+sum);
        System.out.println("Subtraction: "+sub);
        System.out.println("Division: "+div);
        System.out.println("Multiplication: "+mul);

    }
}
