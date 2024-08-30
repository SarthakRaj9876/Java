//Multiple task within single run
package Multithread;
import java.util.*;
class MyThread extends Thread
{
    public void run()
    {
        String tName = Thread.currentThread().getName();
        if(tName.equals("CALC"))
        {
            calc();
        }
        else
        {
            importentMsg();
        }
    }
    public void calc()
    {
        System.out.println("Calculation Task Started");

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=sc.nextInt();

        System.out.println("Please enter 2nd number");
        int num2=sc.nextInt();

        int res=num1+num2;

        System.out.println(res);
        System.out.println("Calculation Task Ended");

        System.out.println("****************************************************");
    }
    public void importentMsg()
    {
        System.out.println("Displaying important message task");
        try{
            for(int i=0;i<3;i++)
            {
                System.out.println("Focus is important to master skills");
                Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
        System.out.println("Displaying import message task ended");

    }
}
public class launch6 
{
    public static void main(String[] args) 
    {
        System.out.println("Main thread started");

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("CALC");
        t2.setName("PRINT");

        t1.start();
        t2.start();
    }
}
