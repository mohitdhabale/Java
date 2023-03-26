class TryCatch1 {
    public static void main(String[] args) {
        System.out.println("Divide by zero");
        try{
            System.out.println(10/0);
        }
        catch (Exception ae) {
            System.out.println(10/2);
            System.out.println(ae);
        }
    System.out.println("Rest of your application");    
    } 
}
