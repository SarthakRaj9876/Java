package inter;
//@FunctionalInterface
interface Car{
    void drive();
}

public class lambda {
    public static void main(String[] args) {
        Car obj = () -> System.out.println("driving");
        obj.drive();
    }
    
}



/*interface Car{
    void drive(int avg);
}

public class lambda {
    public static void main(String[] args) {
        Car obj = (int avg) -> System.out.println("driving");
        obj.drive(15);
    }
    
} */

/*interface Car{
    void drive(int avg , int ts);
}

public class lambda {
    public static void main(String[] args) {
        Car obj = (int avg , int ts) -> System.out.println("driving");
        obj.drive(15 , 55);
    }
    
} */