import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter MArks: ");
        System.out.println("\nPaper 1:");
        double p1=sc.nextDouble();

        System.out.println("Paper 2:");
        double p2=sc.nextDouble();

        System.out.println("Paper 3:");
        double p3=sc.nextDouble();

        System.out.println("Paper 4:");
        double p4=sc.nextDouble();

        double total=p1+p2+p3+p4;
        double per=total/4.0;

        System.out.println("Total :"+total);
        System.out.println("Percentage :"+per);

        char grade;

        if(per>=90){
            grade='A';
        } else if(per>=80){
            grade='B';
        } else if(per>=70){
            grade='C';
        } else if(per>=60){
            grade='D';
        } else if(per>=50){
            grade='E';
        } else if(per>=40){
            grade='F';
        }
        else{
            grade='G';
        }
        System.out.println("Grade: "+grade);
    }    
}
