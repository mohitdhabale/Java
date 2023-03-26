//yield() method

class Mythread extends Thread{

    public void run(){
        for (int i=1;i<=10;i++)
        {
        System.out.println("child thread");
        Thread.yield(); 
        //if no yeild(), there may be more no of times main thread will be executed
        }
    }
}
    
    class Yield{
    
    public static void main(String args[]){
        Mythread t=new Mythread();
        t.start();
        for (int i=1;i<=10;i++)
        {
            System.out.println("main thread");
        }
    
    }
}
    
  
    
    
    