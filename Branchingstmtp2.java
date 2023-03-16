import java.util.Scanner;

import javax.xml.transform.stream.StreamSource;

public class Branchingstmtp2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two no to perform Arithmatic operation: ");
        System.out.println("Enter no 1: ");
        int num1=sc.nextInt();
        System.out.println("Enter no 2: ");
        int num2=sc.nextInt();

        System.out.println("\nEnter choice to perform: ");

        System.out.println("1: Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
        System.out.println("5. Exit");

        int choice=sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("The Addition of "+num1+" & "+num2+" is "+(num1+num2));
                break;
            case 2:
                System.out.println("The Subraction of "+num1+" & "+num2+" is "+(num1-num2));
                break;
            case 3:
                System.out.println("The Division of "+num1+" & "+num2+" is "+(num1/num2));
                break;
            case 4:
                System.out.println("The Multiplication of "+num1+" & "+num2+" is "+(num1*num2));
                break;
            case 5:
                System.out.println("Closing program");
                break;             
            default:
                System.out.println("Invalid choice.....Please enter again");

        }

    }    
}
