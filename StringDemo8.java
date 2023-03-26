class StringDemo8 {
    public static void main(String[] args) {
        String s1="Java";
        boolean b=s1.equalsIgnoreCase("java");

        System.out.println(b);
        System.out.println(s1.equalsIgnoreCase("Java"));

        String s2="Myjava";
        boolean b1=s1.equalsIgnoreCase(s2);
    System.out.println(b1);
    }    
}
