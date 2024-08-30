package MapandGeneric;

import java.util.Hashtable;
import java.util.TreeMap;

public class map4 {
    public static void main(String[] args) {
        Hashtable h1 = new Hashtable();
        h1.put(1,"rohit" );
       // h1.put(2, "virat");
        h1.putIfAbsent(2, "rahul");
        h1.put(3, "sid");


        System.out.println(h1);

        TreeMap tm = new TreeMap();

        Integer i = new Integer(5);
        tm.put(1,"rohit" );
         tm.put(2, "virat");
         tm.put(3, "sid");

         System.out.println(tm);
 
 




    }
    
}
