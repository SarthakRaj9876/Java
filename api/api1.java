package api;
///import java.util.Date;
//import java.util.ArrayList;

public class api1 {
    public static void main(String[] args) {
        java.util.Date dt = new java.util.Date();

        System.out.println(dt);

       long TimeInMs = dt.getTime();

       java.sql.Date dt1 = new java.sql.Date(TimeInMs);

    System.err.println(dt1);

     // java.util.ArrayList ar = new java.util.ArrayList();


       
    }
    
}
