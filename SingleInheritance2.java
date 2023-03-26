//single inheritance

class Parent1{
    public void add(int a,int b){
        System.out.println("Addition is "+(a+b));
    }
}
class Child1 extends Parent1{
    public void sub(int a,int b){
        System.out.println("Subtraction is "+(a-b));
    }
}
class SingleInheritance2{
    public static void main(String[] args){
        
        Child1 c=new Child1();
        Parent1 p=new Parent1();
        p.add(6,22);
        c.add(5,22);
        c.sub(5,22);
    }
}
