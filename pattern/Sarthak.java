package pattern;
import java.util.Scanner;
public class Sarthak {
  public static void main(String[] args) 
  {
    Scanner sa = new Scanner(System.in);
    System.out.println("Enter an odd integer n");
      int n = sa.nextInt();
      for(int i=0 ; i<n ; i++) 
      {
        
         
          for(int j=0 ; j<n ; j++)
          {
              if(i==0  && j>0 && j<=(n-1)/2  || i==(n-1)/4 && j>0 && j<(n-1)/2  || j==0 && i>0 && i<(n-1)/4 || 
                 j==(n-1)/2 && i<(n-1)/2 && i>(n-1)/4 || i==(n-1)/2 && j<(n-1)/2)
              {
               System.out.print("*");
              }
              else
              {
                System.out.print(" ");
              }
          
          } 
          System.out.print("");
          for(int j=0 ; j<n ; j++)
          {
              if(i+j==(n-1)/2 || j-i==(n-1)/2 || i==(n-1)/4 && j>(n-1)/4 && j<((n-1)-(n-1)/4))
          
              {
               System.out.print("*");
              }
              else
              {
                System.out.print(" ");
              }
          
          } 
          System.out.print("  ");
          for(int j=0 ; j<n ; j++)
          {
          if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 && i<=(n-1)/2 || 
             j==(n-1)/2 && i>0 && i<(n-1)/4 || i==(n-1)/4 && j<(n-1)/2 || i-j==(n-1)/4 && i<=(n-1)/2)
          
          
              {
               System.out.print("*");
              }
              else
              {
                System.out.print(" ");
              }
          
          }
          System.out.print("");
          for(int j=0 ; j<n ; j++)
          {
          if(i==0 && j<=(n-1)/2 || j==(n-1)/4 && i<=(n-1)/2)
          
              {
               System.out.print("*");
              }
              else
              {
                System.out.print(" ");
              }
          
          }
          System.out.print("");
          for(int j=0 ; j<n ; j++)
          {
          if(j==0 && i<=(n-1)/2 || j==(n-1)/2 && i<=(n-1)/2 || i==(n-1)/4 && j<=(n-1)/2)
          
          
              {
               System.out.print("*");
              }
              else
              {
                System.out.print(" ");
              }
          
          }
          System.out.print("");
          for(int j=0 ; j<n ; j++)
          {
              if(i+j==(n-1)/2 || j-i==(n-1)/2 || i==(n-1)/4 && j>(n-1)/4 && j<((n-1)-(n-1)/4))
          
              {
               System.out.print("*");
              }
              else
              {
                System.out.print(" ");
              }
          
          } 
          System.out.print("  ");
          for(int j=0 ; j<n ; j++)
          {
              if(j==0 && i<=(n-1)/2 ||i-j==(n-1)/4 && i<=(n-1)/2 || i+j==(n-1)/4)
          
              {
               System.out.print("*");
              }
              else
              {
                System.out.print(" ");
              }
          
          }
          System.out.print("  ");
          for(int j=0 ; j<n ; j++)
          {
          if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 && i<=(n-1)/2 || 
             j==(n-1)/2 && i>0 && i<(n-1)/4 || i==(n-1)/4 && j<(n-1)/2 || i-j==(n-1)/4 && i<=(n-1)/2)
          
          
              {
               System.out.print("*");
              }
              else
              {
                System.out.print(" ");
              }
          
          }
          System.out.print("");
          for(int j=0 ; j<n ; j++)
          {
              if(i+j==(n-1)/2 || j-i==(n-1)/2 || i==(n-1)/4 && j>(n-1)/4 && j<((n-1)-(n-1)/4))
          
              {
               System.out.print("*");
              }
              else
              {
                System.out.print(" ");
              }
          
          } 
          System.out.print("");
          for(int j=0 ; j<n ; j++)
          {
              if(i==0 && j<=(n-1)/2 || j==(n-1)/4 && i<(n-1)/2 || i==(n-1)/2 && j<(n-1)/4 && j>0 || j==0 && i<(n-1)/2 && i>(n-1)/4)
          
              {
               System.out.print("*");
              }
              else
              {
                System.out.print(" ");
              }
          
          }
          System.out.println();

    }
  }  
}
