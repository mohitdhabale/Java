public class Smallestno {
    public static void main(String[] args) {
        System.out.println("NO are 100 20 30 40");

        int a=100;
        int b=20;
        int c=30;
        int d=40;
        int small;

        if(a<b){
            if(a<c)
            small=a;
            else
            small=c;

            if(a<d)
            small=a;
            else
            small=d;
        }
        else{
            if(b<c)
            small=b;
            else
            small=c;

            if(b<d)
            small=b;
            else
            small=d;

        }
        System.out.println("Small no : "+small);
    }
    
}
