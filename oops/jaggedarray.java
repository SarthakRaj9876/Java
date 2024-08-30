package oops;

public class jaggedarray {
    public static void main(String[] args) {
        int nums [][]={ {8,9,7,8},{6,5,},{3,2,2} };

        for(int i=0 ; i<=3 ; i++)
        {
            for(int j=0 ; j<nums[i].length ; j++)
                {
                System.out.print( nums[i][j] + "   "  );
                }
                System.out.println();
        }
    }
    
}
