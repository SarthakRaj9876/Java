package Exception;

public class tryCatch2 {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 3;
        int result = 0;
        String name=null;
        int value[]= {4,5,6,2,8};
        try
        {
            result= num1 / num2;
           // result1= num1/ name.length();         
            System.out.println(value[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("something went wrong" +e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(value[value.length-1]);
            System.out.println("stay in your limit");
        }
        catch(Exception e)                                          //for extra error 
        {
            System.out.println("someting went wrong");
        }
            System.out.println(result);
            System.out.println("nice hiiiiiiiiiiiiiiiiiiiiiiiii");
    }
}
    

