import java.util.Scanner;

public class Selectionstmtp2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You can't vote because you are below 18");
        }
    }    
}
