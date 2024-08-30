package inter;
interface A
{
    void how();
    default void config()
    {
         System.out.println("wow , non static ");
    }
    static void abcd()
    {
        System.out.println("festure");
    }
}
class B implements A 
{
    public void how()
    {
        System.out.println("show gaya");
    }
}

public class java8fea 
{
  public static void main(String[] args) 
    {
    A.abcd();
    //A.config();
    A obj = new B();
    obj.how();
    obj.config();
    }    
}
