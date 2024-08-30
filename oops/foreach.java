package oops;

public class foreach {
    public static void main(String[] args) 
    {
        int nums [][]={ {8,9,7,8},{6,5,4,4},{3,2,1,2} };           

        for(int a[] : nums)                                         // all type of array  
        {
            for(int b : a)
                {
                System.out.print( b + "   "  );
                }
                System.out.println();
        }
    }
}
