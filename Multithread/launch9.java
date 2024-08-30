package Multithread;

class car implements Runnable
{
    synchronized public void run()
    {
    
      try 
      {
            System.out.println(Thread.currentThread().getName() + "Has enter in parking lot ");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "Got into the car ");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "Starth drive the car ");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "Came back and park the car ");
            Thread.sleep(2000);

      } 
      catch (Exception e) 
        {
        System.out.println("some problem");
        }  
      }
       
    }


public class launch9
{
    public static void main(String[] args) 
    {
    
      car c = new car();
      Thread t1 = new Thread(c);
      Thread t2 = new Thread(c);
      Thread t3 = new Thread(c);

      t1.setName("SON-1 ");
      t2.setName("SON-2 ");
      t3.setName("SON-3 ");

      t1.start();
      t2.start();
      t3.start();

     

    }
}

