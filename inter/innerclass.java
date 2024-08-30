package inter;
class C
{
    public void show()
    {
       System.out.println("in show");
    }
    class D                                        // static
    {
    public void display()
        {
          System.out.println("in display");
        }
    }
}

public class innerclass                             // inner - member , static , anonymous
{
    public static void main(String[] args) 
    {
        C obj = new C();
        C.D obj1 = obj.new D();           // for call class D method
        //C.D obj1 = new C.D();              if class is static
        obj.show();
        obj1.display();
    }
}

