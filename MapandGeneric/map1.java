package MapandGeneric;

import java.util.*;

public class map1 {
    public static void main(String[] args) {
        HashMap h1 = new HashMap();

       // Hashtable h2 = new Hashtable();
        //LinkedHashMap h3 = new LinkedHashMap();

        h1.put(01, "rohan");
        h1.put(02, "virat");
        h1.put(03, 50);
        h1.put(04, 555.888);
      //  h1.put(03, 50);
       
      h1.put("rohit", "ankush");
      h1.put("ram", "rahul");



        System.out.println(h1);

         LinkedHashMap h3 = new LinkedHashMap();
         h3.put(01, "rohan");
         h3.put(02, "virat");             // is called entry
         h3.put(03, 50);
         h3.put(04, 555.888);

         System.out.println(h3);

    }

    
}
