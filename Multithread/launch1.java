package Multithread;
import java.util.Scanner;
public class launch1 {
    public static void main(String[] args) {
        System.out.println("Calcuiation task started");
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Enter the first number");
        int num1 = sc1.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc1.nextInt();

        int res = num1 + num2 ;
        System.out.println(res);

        System.out.println("Calculation task ended");

        System.out.println("***************************************************************************");


        System.out.println("Printed task started");
        for(int i= 0 ; i<4 ; i++)
        {

        System.out.println("*");

        }
        System.out.println("Printing task ended");

        System.out.println("*******************************************************************************");

        System.out.println("Dasplaying task started");
        for(int i= 0 ; i< 4 ; i++)
        {
        System.out.println("Focus is very important to master the skill");
        }

        System.out.println("Displaying task is ended");

        System.out.println("*******************************************************************************");
    }
}
