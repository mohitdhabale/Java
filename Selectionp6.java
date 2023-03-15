import java.util.Scanner;

public class Selectionp6 {
    public static void main(String[] args) {
        java.util.Scanner sc=new Scanner(System.in);
        int num;

        System.out.println("Enter the day no (1 to 7): ");
        num=sc.nextInt();

        if(num==1){
            System.out.println(num+" - Day is Sunday");
        }
        if(num==2){
            System.out.println(num+" - Day is Monday");
        }
        if(num==3){
            System.out.println(num+" - Day is Tuesday");
        }
        if(num==4){
            System.out.println(num+" - Day is Wednesday");
        }
        if(num==5){
            System.out.println(num+" - Day is Thursday");
        }
        if(num==6){
            System.out.println(num+" - Day is Friday");
        }
        if(num==7){
            System.out.println(num+" - Day is Saturday");
        }
    }
} 

