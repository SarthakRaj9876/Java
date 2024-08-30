package String;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first string : ");
        String s1 = obj.next();
        System.out.println("Enter the second string : ");
        String s2 = obj.next();
        s1 = s1.replace(" " , ""); 
        s2 = s2.replace(" " , "");
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char arr1 [] = s1.toCharArray();
        char arr2 [] = s2.toCharArray();
        Arrays.sort(arr1); 
        Arrays.sort(arr2);
        if(Arrays.equals(arr1 , arr2))
        {
            System.out.println("It is an Anagram");
        
        }
        else
        {
            System.out.println("It is not an Anagram");
        }
        
    }
}
