import java.util.Scanner;

public class Selectionp4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;

        System.out.println("Enter the no: ");
        num=sc.nextInt();

        if(num>0){
            System.out.println("The no is positive");
        }
        else if(num==0){
            System.out.println("The no is zero");
        }
        else if(num<0){
            System.out.println("The no is negative");
        }
    }    
}
