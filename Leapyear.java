import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {

        //Find Leap year

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year: ");
        int y=sc.nextInt();

        if(y%4==0){
            System.out.println("This is Leap Year");
        }
        else{
            System.out.println("This is not leap year");
        }
    }
    
}
