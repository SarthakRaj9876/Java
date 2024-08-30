package inter;
interface computer
{
     void compilecode();
}
class Laptop implements computer{
    public void compilecode()
    {
        System.out.println("you got 5 error ");
    }
} 
class Desktop implements computer{
    public void compilecode()
    {
        System.out.println("you got 5 error, faster ");
    }
}
class Developer
{
    public void buildapp(computer obj)
    {
        System.out.println("Bulding app");   
        obj.compilecode();
    }
}
public class Demo3
{
    public static void main(String[] args) {
        computer obj = new Desktop();
        Developer dev = new Developer();
        dev.buildapp(obj);
    }
}

   