package MapandGeneric;

import java.util.*;

public class map2 {
    
    public static void main(String[] args) {
        Map map = new  HashMap();
        map.put(1,"poll");
        map.put(3, "rohit");
        map.put(4, "virat");
        map.put(5, "ankit");

        System.out.println(map);

        System.out.println(map.get(4));

        Set keyset = map.keySet();   //return key
        Iterator itr1 = keyset.iterator();

        while (itr1.hasNext()) {

            // System.out.println(itr1.next());
          Integer key = (Integer)itr1.next();
          System.out.println(key);
            
        }
         
        Collection value = map.values();
        Iterator itr2 = value.iterator();


        while (itr2.hasNext()) {

            //System.out.println(itr2.next());
            String names = (String)itr2.next();
            System.out.println(names);
            
        }



        Set entryset = map.entrySet();
        Iterator itr3 = entryset.iterator();


        while (itr3.hasNext()) {

           // System.out.println(itr3.next());

          Map.Entry data = (Map.Entry)itr3.next();
          System.out.println(data.getKey() + " : " +  data.getValue());
          
            
        }
        
        






    }
}
