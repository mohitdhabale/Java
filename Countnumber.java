import java.util.Scanner;

public class Countnumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int no=sc.nextInt();
        int cout=0;
        while (no!=0){
            cout++;
            no/=10;
        }
        System.out.println("No of digits: "+cout);
    }
}