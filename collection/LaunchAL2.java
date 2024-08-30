package collection;

import java.util.*;

public class LaunchAL2 {
    public static void main(String[] args) {
        ArrayDeque AD1 = new ArrayDeque();
            
        AD1.add(500);
        AD1.add(200);
        AD1.add(100);

        System.out.println(AD1);
        
        AD1.add("plmhuf");
        System.out.println(AD1);

        AD1.offer(600);

        AD1.offerFirst("api");
        AD1.offerLast("GUI");

        System.out.println(AD1);
    }
}
