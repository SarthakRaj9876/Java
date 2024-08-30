package oops;

class cal
{
  public int add(int nums [] )
     {
        int result = 0;
            for(int n : nums)
            {
         result = result + n;
            }
            return result;
     }
}

public class anonynomoes {
    public static void main(String[] args) {
        cal obj = new cal();
        //int nums [] = {5,6,3,1,3};
        int result= obj.add(new int[]{5,9,6,});
        System.out.println(result);
    }
    
}
