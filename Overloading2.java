//Method overriding

class A{
    public int a=20;
    public void show(){
        System.out.println("Class A show");
    }    
};

class B extends A{ 
    public int a=40; 
    public void show(){ 
        System.out.println("Class B show");
    }
};
    
class Overloading2{    
    public static void main(String[] args){
        B obj=new B();
        obj.show();
    }
}