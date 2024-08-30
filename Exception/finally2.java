package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class finally2 {
    public static void main(String[] args) {
        int num= 0;
        Scanner  sc = new Scanner(System.in);
        /*try(Scanner  sc = new Scanner(System.in);)
        {
            num = sc.nextInt();
        }*/
        try
        {
            num = sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Enter a number");
        }
        finally
        {
            sc.close();
        }                                                 //all remove
        System.out.println(num);                          //DRY -> DO NOT REPEAT YOURSELF
    }
    
}
