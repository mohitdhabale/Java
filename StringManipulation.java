public class StringManipulation {
    public static void main(String[] args) {
        String str="help4code";
        System.out.println(str);

        String str1=new String ("Java");
        System.out.println(str1);
        
        char[] ch={'h','e','l','l','o'};
        String str3=new String(ch);
        System.out.println(str3);

        char[] ch1={'m','o','h','i','t'};
        String str4=new String(ch1,2,4);
        System.out.println(str4);

        byte[] b={1,2,3,4,5};
        String str5=new String(b);
        System.out.println((str5));

    }
    
}
