import java.util.Scanner;

public class BranchingStmtp1 {
    public static void main(String[] args) {

        System.out.println("Enter choice no: ");
        System.out.println("1. Find square of no");
        System.out.println("2. Find cube of no");
        System.out.println("3. Check no is Leap year or not");
        System.out.println("4. Exit");

        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nEnter the no: ");
                long num1=sc.nextLong();
                System.out.println("The square of " +num1+" is "+num1*num1);
                break;
            case 2:
                System.out.println("\nEnter the no: ");
                long num2=sc.nextLong();
                System.out.println("The cube of "+num2+" is "+num2*num2*num2);
                break;
            case 3:
                System.out.println("\nCheck no is Leap year or not: ");
                int year=sc.nextInt();

                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    System.out.println(year+" is Leap year");
                }
                else{
                    System.out.println(year+" is not leap year");
                }
                break;
            case 4:
                System.out.println("Closing program");
                break;

            default:
                System.out.println("Invalid choice.....Please enter again");     
        }

    }    
}