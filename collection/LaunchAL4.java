package collection;

import java.util.TreeSet;

public class LaunchAL4 {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        ts.add(50);           //shorted array
        ts.add(10);
        ts.add(40);
        ts.add(60);
        ts.add(90);
        ts.add(100);
        ts.add(5);

        System.out.println(ts);
         System.out.println(ts.higher(40));
         System.out.println(ts.lower(90));

         System.out.println(ts.ceiling(40));
         System.out.println(ts.floor(40));

         System.out.println(ts.ceiling(30));
         System.out.println(ts.floor(30));
    }
    
}
