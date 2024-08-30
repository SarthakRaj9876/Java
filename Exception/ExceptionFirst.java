package Exception;

class MyException1 extends Exception
{
  
  public MyException1(){}

  public MyException1(String msg)
  {
    super(msg);
  }

}

public class ExceptionFirst
{
  public static void main(String[] args) 
  {
    int num1 = 6;
    int num2 = -2;
    try
    { 
      if (num2 < 0 ) 
      {
          MyException1 e = new MyException1("negative number");
          throw e;
      }
      else
      {
        int result= num1/num2;
        System.out.println(result);
      }
    }
    catch(Exception e)
    {
      System.out.println(" enter a vailed number " +e );
    }
  }    
}
