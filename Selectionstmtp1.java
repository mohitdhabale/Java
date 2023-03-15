import java.util.Scanner;

public class Selectionstmtp1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no: ");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("The no is even");
        }
        else{
            System.out.println("The no is odd");
        }
    }    
}
