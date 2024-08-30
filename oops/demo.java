package oops;
class cal{
    public void show(byte n){
        System.out.println("byte" +n);
    }
    public void show(short n){
        System.out.println("short" +n);
    }
    public void show(char n){
        System.out.println("char" +n);
    }
    public void show(int n){
        System.out.println("int" +n);
    }
}
public class demo {
    public static void main(String[] args) {
        cal obj = new cal();
        
         obj.show(555);
        System.out.println(obj);
    }
}
