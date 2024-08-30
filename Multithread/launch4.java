package Multithread;
import java.util.Scanner;
class cal extends Thread
{
   public void run()
   {
     System.out.println("Calculation started");
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the first number");
     int num1 = sc.nextInt();
     System.out.println("Enter the second number");
     int num2 = sc.nextInt();
     int res = num1 + num2 ;

     System.out.println(res);
     System.out.println("Calculation ended");

     System.out.println("***************************************************************");

   }
}

class massage extends Thread
{
    public void run()
    {
        System.out.println("Displaying task started");
    try{
    for(int i=0; i<5; i++)
      {
        System.out.println("Focus is importent to master the skill");
        Thread.sleep(2000);
      }
    
      }
    catch(Exception e)
    {
        System.out.println("some problem");
    }
        System.out.println("Displaying task ended");
    }
}

public class launch4 {
    public static void main(String[] args) 
    {
    System.out.println("Main Thread");   
    cal t1 = new cal();
    massage t2 = new massage();
    t1.start();
    t2.start();
    }
}
