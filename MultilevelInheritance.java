//multilevel inheritance

class Add {
    public void add(int a, int b){ 
        System.out.println("Addition is "+(a+b));
    } 
}

class Sub extends Add{
    public void sub (int a,int b){ 
        System.out.println("Substraction is "+(a-b));
    }   
} 

class Mul extends Sub{
    public void mul(int a, int b){
        System.out.println("Multiplication is "+(a*b));
    }
}

class MainJava {
    public static void main(String[] args) { 
    Add obj1=new Add();
    obj1.add(66,22);

    Sub obj2=new Sub();
    obj2.add(55,22);
    obj2.sub(55,22);

    Mul obj3=new Mul();
    obj3.add(11,220);
    obj3.sub(111,22);
    obj3.mul(11,22);

    }
}