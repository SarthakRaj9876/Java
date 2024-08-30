package Static;
class demo2{
    static int a; 
    static int b;
    int m;
    int n;
    static{
        a=20;
        b=10;
        System.out.println("control in static block");

    }
    {
        m=60;
        n=50;
    }
    static void dp1()
    {
        System.out.println("value of static var " +a);
        System.out.println("value of static var " +b);
    }
    void dp2(){
        System.out.println("value of intance var " +m);
        System.out.println("value of intance var " +n);
    }
}
public class staticdemo2 {
    public static void main(String[] args) {
        demo2.dp1();
        //demo.ddk2();
       demo2 d= new demo2();
        d.dp2();
        d.dp1();
    }
    
}

