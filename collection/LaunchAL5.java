package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LaunchAL5 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();

        hs.add(50);
        hs.add(30);
        hs.add(40);
        hs.add(70);

        System.out.println(hs);

        LinkedHashSet hs1 = new LinkedHashSet();

        hs1.add(80);
        hs1.add(55);
        hs1.add(45);
        hs1.add(10);

        System.out.println(hs1);

        
    }
    
}
