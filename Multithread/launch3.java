package Multithread;
class MyThread1 extends Thread{

    public void run()
    {
        System.out.println("Child Thread");
    }
}


public class launch3 
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread"); 

        MyThread1 t=new MyThread1();
        t.start();

    }
    
}
