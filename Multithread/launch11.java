package Multithread;
class Library implements Runnable
{
    String res1 = new String("java");
    String res2 = new String("SQL");
    String res3 = new String("DSA");


public void run()
{
    String name = Thread.currentThread().getName();
    if(name.equals("STUDENT 1 "))
    {
      try 
      {
           Thread.sleep(3000);
           synchronized(res1)
           {
              System.out.println("STUDENT 2 has acc " + res1);
              Thread.sleep(3000);
              synchronized (res2) 
              {
                  System.out.println("STUDENT 1 has acc "+ res2);
                  Thread.sleep(3000);
                  synchronized (res3) 
                  {
                    System.out.println("STUDENT 1 has acc "+ res3); 
                    Thread.sleep(3000); 

                  }
              }
           }
      } 
      catch (Exception e) 
      {
         System.out.println("some problem ");
      }
    }

    else
    {
        try 
        {
            Thread.sleep(3000);
            synchronized(res3)
            {
                System.out.println("STUDENT 1 has acc " + res3);
                Thread.sleep(3000);
                synchronized (res2) 
                {
                    System.out.println("STUDENT 1 has acc "+ res2);
                    Thread.sleep(3000);
                    synchronized (res1) 
                    {
                      System.out.println("STUDENT 2 has acc "+ res1); 
                      Thread.sleep(3000); 
  
                    }
                }
            }
        } 
        catch (Exception e) 
        {
           System.out.println("some problem ");
        }
    }
}
}

public class launch11 
{
    public static void main(String[] args) {

        Library lib = new Library();

        Thread t7 = new Thread(lib);
        Thread t8 = new Thread(lib);
        Thread t9 = new Thread(lib);

        t7.setName("STUDENT 1 ");
        t8.setName("STUDENT 2 ");

        t7.start();
        t8.start();
        
    }
}
