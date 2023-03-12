import java.util.Scanner;

public class Acceptfindsmallestno {
    public static void main(String[] args) {

        // Accept 3 no and find smallest between them
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 3 numeber: ");
        System.out.println("Enter no 1:");
        double a=sc.nextDouble();

        System.out.println("Enter no 2:");
        double b=sc.nextDouble();

        System.out.println("Enter no 3:");
        double c=sc.nextDouble();

        double small=a;

        if(b<small){
            small=b;
        }
        if(c<small){
            small=c;
        }
        System.out.println("no:"+small);
    }    
}
