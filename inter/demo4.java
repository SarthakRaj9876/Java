package inter;
interface A
{
    void show();
    void show2();
}
interface X
{
    void disp();
}
class B implements A,X
{
    public void show2()
    {

    }
    public void show()
    {
        System.out.println("void show");
    }
    public void disp()
    {
        System.out.println("oooooooooo");
    }
}

public class demo4 
{
    public static void main(String[] args) 
    {
       // A obj = new B();                     
        B obj= new B();
        obj.show();
        obj.disp();
    }
}
