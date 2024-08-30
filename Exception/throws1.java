package Exception;
class Demo
{
    public void a()
    {
        try{
            b();
        }
        catch(Exception e)
        {
            System.out.println("error" +e);
        }
    }
    public void b() throws Exception
    {
       int num1=6;
       int num2=0;
       int result = num1 / num2;
       System.out.println(result);
    }
}
public class throws1 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.a();
    }
}
