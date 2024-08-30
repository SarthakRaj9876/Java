package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LaunchAL6 {

    public static void main(String[] args) {
        ArrayList ar5 = new ArrayList();
        ar5.add(50);
        ar5.add(30);
        ar5.add(40);
        ar5.add(20);

        System.out.println(ar5);

        // for loop

      /* for (int i = 0; i <ar5.size(); i++) {

            Object o = ar5.get(i);
            System.out.println(o);

            System.out.println(ar5.get(i));
            
        }

        //for each

        for(Object o : ar5){

            System.out.println(o);


        }*/




        Iterator itr = ar5.iterator();
        while(itr.hasNext()){

          //Integer i = (Integer)itr.next();
            System.out.println(itr.next());

            
        }

      
        ListIterator itr1= ar5.listIterator(ar5.size());
        while (itr1.hasPrevious()) {
            System.out.println(itr1.previous());
            
        }

    }
    
}
