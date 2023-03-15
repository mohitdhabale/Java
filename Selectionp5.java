import java.util.Scanner;

public class Selectionp5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num1,num2,num3,large;

        System.out.println("Enter no 1: ");
        num1=sc.nextDouble();

        System.out.println("Enter no 2: ");
        num2=sc.nextDouble();

        System.out.println("Enter no 3: ");
        num3=sc.nextDouble();


        large=num1;
        
        if(num2>large){
            large=num2;
        }
        if(num3>large){
            large=num3;
        }

        System.out.println(large+" is the largest no");

        if(num1==num2 && num2==num3){
            System.out.println("All no are equal");
        }
        else{
            System.out.println("All no aren't equal");
        }
    }
}
