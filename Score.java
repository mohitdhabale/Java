import java.util.Scanner;
public class Score{
    public static void main(String[] args){
        System.out.println("Enter marks :");

        Scanner in=new Scanner(System.in);

        System.out.println("Papaer 1:");
        int p1=in.nextInt();

        System.out.println("Paper 2:");
        int p2=in.nextInt();

        System.out.println("Paper 3:");
        int p3=in.nextInt();

        if(p1>=45 && p2>=45 && p3>=45){
            System.out.println("Your score is good");
        }
        else{
            System.out.println("You need to Improve");
        }
    }
}