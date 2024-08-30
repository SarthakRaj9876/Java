package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchAL7 {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(50);
        arr.add(30);
        arr.add(40);
        arr.add(20);

        System.out.println(arr);


        // why we not use for loop for fetching the data

      /*   for (int i = 0; i <arr.size(); i++) {

            System.out.println(arr.get(i));
            arr.add(100);
        }*/
        
        // Fail Fast

        Iterator it = arr.iterator();

        while (it.hasNext()) {
            
            System.out.println(it.next());

           // arr.add(100);
            
        }

        // Fail safe
        
        CopyOnWriteArrayList arr1 = new CopyOnWriteArrayList();
        arr1.add(50);
        arr1.add(30);
        arr1.add(40);
        arr1.add(20);

        System.out.println(arr1);

        arr1.add(500);






    }

}