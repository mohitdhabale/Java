public class Largestno {

    public static void main(String[] args) {
        System.out.println("No are 10 20 30 40 50");

        int a=10;
        int b=20;
        int c=30;
        int d=40;
        int e=50;
        
        int Largest=e;

        if(a>=Largest) {
            Largest=a;
        }
        if(b>=Largest){
            Largest=b;
        }
        if(c>=Largest){
            Largest=c;
        }
        if(d>=Largest){
            Largest=d;
        }
        if(e>=Largest){
            Largest=e;
        }

        System.out.println("Largest no is :"+Largest);

    }
    
}
