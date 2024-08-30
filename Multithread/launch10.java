package Multithread;

class car2 implements Runnable
{
 public void run()
    {
    
      try 
      {
            System.out.println(Thread.currentThread().getName() + "Has enter in parking lot ");
            Thread.sleep(2000);

            synchronized (this) 
            {
                
            System.out.println(Thread.currentThread().getName() + "Got into the car ");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "Starth drive the car ");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "Came back and park the car ");
            Thread.sleep(2000);

            }

      } 
      catch (Exception e) 
        {
        System.out.println("some problem");
        }  
      }
       
    }


public class launch10
{
    public static void main(String[] args) 
    {
    
      car2 c1 = new car2();
      Thread t4 = new Thread(c1);
      Thread t5 = new Thread(c1);
      Thread t6 = new Thread(c1);

      t4.setName("SON-1 ");
      t5.setName("SON-2 ");
      t6.setName("SON-3 ");

      t4.start();
      t5.start();
      t6.start();

     

    }
}


