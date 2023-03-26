//Method Overloading

import java.util.*;

class Overloading
{
    void add(int a, int b){ 
        System.out.println(" Result is "+(a+b)); 
    }    
    void add(int a, int b, int c){ 
        System.out.println(" Result is "+(a+b+c)); 
    }    
    void add(int a, int b, int c,int d){ 
        System.out.println(" Result is "+(a+b+c+d));
    }    
}

class Overloading1{
    public static void main(String[] args)
    {
        Overloading obj=new Overloading();

        obj.add(2,3);
        obj.add(4,5,6);
        obj.add(1,2,3,4);
    }
}