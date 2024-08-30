package Static;

class demo {
    static void disp1()
    {
        System.out.println("static disp");
    }
    void disp2()
    {
        System.out.println("static disp2");
    }
    
}
public class staticdemo{
    public static void main(String[] args) {
        
        demo.disp1();
         //demo.disp2();                          // non static
        demo d = new demo();                    //creat class obj
        d.disp1();                                    //we can call without creating obj
        d.disp2();

    }
}