package oops;

class Arrays{
    public static void main(String[] args) 
    {
        
    
    //int num[][] =new int [4][4];
       // num[0][0]= 8;    
       // num[0][1]= 9;
       // num[0][2]= 7;
       // num[1][0]= 6;
       // num[1][1]= 5;
       // num[1][2]= 4;
       // num[2][0]= 3;
       // num[2][1]= 2;
       // num[2][2]= 1;

         int nums [][]={ {8,9,7,8},{6,5,4,4},{3,2,1,2} };

        for(int i=0 ; i<=3 ; i++)
        {
            for(int j=0 ; j<=3 ; j++)
                {
                System.out.print( nums[i][j] + "   "  );
                }
                System.out.println();
        }
  
    }    
}