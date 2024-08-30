package Static;

public class LaunchDemo {
    static int a ;                                     //first static var
    static {                                            //second
        int a = 10 ; 
    System.out.println("Static block first");
    System.out.println(a);
    }
    static void disp()                                               //fourth
        {
            System.out.println("static method disp main ke bad jab hum call krege");
        }

    
    public static void main(String[] args) {
        System.out.println("main method bad mai");         //third
        disp();
        
    }
    
    }

