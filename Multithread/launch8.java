package Multithread;
class Example implements Runnable
{
    public void run()
    {
      for(int i=0; i<3; i++){
      try 
      {
            System.out.println("focus is important");
            Thread.sleep(2000);
  
      } 
      catch (InterruptedException e) 
        {
        System.out.println("thread is intrrupted");
        }  
      }
       
    }
}

public class launch8
{
    public static void main(String[] args) 
    {
    
      Example ex = new Example();
      Thread t = new Thread(ex);
      t.start();
      t.interrupt();        //without intrrupt 
   

    }
}

