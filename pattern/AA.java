package pattern;

public class AA {
    public static void main(String[] args) 
    {
        int n=11;
        for(int i=0 ; i<n ; i++) 
        {
          
           
            for(int j=0 ; j<n ; j++)
            {
            if(i+j==(n-1)/2 || j-i==(n-1)/2 || i==3 && j>=2 && j<=8)
            
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
