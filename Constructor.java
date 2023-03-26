//Constructor calling hierarchy

class A1{
    public A1(){
        System.out.println("Class A Constructor");
    }
    public void showA1(){
        System.out.println("Class A show");
    }
};
    
class B1 extends A1{ 
    public B1()
    {
    System.out.println("Class B Constructor");
    }

    public void showB1(){ 
    System.out.println("Class B show");
    }
};

class Constructor{
    public static void main(String[] args){
        B1 obj=new B1();
        obj.showB1();
        A1 obj1=new A1();
        obj1.showA1();
    }
}