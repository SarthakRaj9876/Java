package inter;
interface Car
{
    void drive();
}
public class Anonymous {
    
    public static void main(String[] args) {
        Car obj = new Car()
        {
           public void drive()
           {
              System.out.println("wooooooooooooooooooooow");
           }
        };
        obj.drive();
    }
    
}
