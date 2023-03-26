//Program for abstract and non-abstract methods abstract class Test

abstract class Test
{
    abstract void m1(); 
    abstract void m2();
    abstract void m3(); 
    void m4(){
        System.out.println("m4 non-abstract method");
    }
}
class AbstrNonAbstr extends Test
{
    void m1(){   
        System.out.println("m1 abstract method");
    } 
    void m2(){
        System.out.println("m2 abstract method");
    }
    void m3(){ 
        System.out.println("m3 abstract method");
    }
    public static void main(String[] args)
    {
        AbstrNonAbstr t = new AbstrNonAbstr();
        t.m1(); t.m2();
        t.m3(); t.m4();
    }
}