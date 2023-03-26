//single inheritance

class Parent{
    public void add(int a,int b){
        System.out.println("Addition is "+(a+b));
    }
}
class Child extends Parent{
    public void sub(int a,int b){
        System.out.println("Subtraction is "+(a-b));
    }
}
class MyJava{
    public static void main(String[] args) {
        Child c=new Child();
        c.add(55,22);
        c.sub(55,22);
    }
}
