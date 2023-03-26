//join() method

class Mythread extends Thread{

    public void run(){
    for (int i=1;i<=10;i++)
    {
    System.out.println("child thread");
    try{
        Thread.sleep(100);
    }
    catch (InterruptedException ie){}
    }
}
}
    class Join{

    public static void main(String args[]) throws InterruptedException
    {
        Mythread t=new Mythread();
        t.start();
        t.join();
        //main thread call child thread to join, and will wait until completing child th
    
        for(int i=1;i<=10;i++)
        {
            System.out.println("main thread");
        }
    }
}