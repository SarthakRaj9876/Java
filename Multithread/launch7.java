package Multithread;
class Printing implements Runnable
{
    public void run()
    {
      try 
      {
        for(int i=0; i<3; i++)
        {
            System.out.println("focus is important");
            Thread.sleep(3000);
        }
      } 
      catch (Exception e) 
        {
        System.out.println("some problem");
        }  
       
    }
}

public class launch7 
{
    public static void main(String[] args) throws Exception
    {
      System.out.println("main thread started"); 
      Printing p = new Printing();
      Thread t = new Thread(p);
      System.out.println(t.isAlive()); //false
      
      t.start();
      System.out.println(t.isAlive());     //true
      t.join();                     // for complet all upper task
     
      System.out.println("all task finished");


    }
}
