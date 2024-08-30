import java.util.Scanner;

public class UserInput {
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the age");
    int age = scan.nextInt();
    System.out.println("Age is " +age);
    System.out.println("Enter the avg");
    double avg= scan.nextDouble();
    System.out.println("Avg is "+avg);
    System.out.println("Enter the name");
    String name =scan.next();
    System.out.println("Name is " +name);
}
    
}
