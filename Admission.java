import java.util.Scanner;

public class Admission{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Marks:");
        System.out.println("Paper 1:");
        int p1=sc.nextInt();

        System.out.println("Paper 2:");
        int p2=sc.nextInt();

        System.out.println("Paper 3:");
        int p3=sc.nextInt();

            int total=p1+p2+p3;
            double per=total/3.0;

        System.out.println("Enter gender (M/F)");
        String gender=sc.next();

        if(per>=62 && gender.equals("F")){
            System.out.println("Total: "+total);
            System.out.println("Percentage: "+per);
            System.out.println("You can take admission");
        }
        else{
            System.out.println("Only girls can take admission");
        }
    }
}