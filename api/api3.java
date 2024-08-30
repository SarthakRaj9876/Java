package api;

import java.util.Arrays;
import java.util.List;


public class api3 {
    public static void main(String[] args) {
       
        
        // ArrayList<Integer> ar  = new ArrayList<Integer>();
        // ar.add(20);
        // ar.add(30);
        // ar.add(40);
        // ar.add(60);
        // ar.add(70);
        // ar.add(90);

        // System.out.println(ar);

        List<Integer> ar1 = Arrays.asList(2,4,8,7,9);

        System.out.println(ar1);

        //  for (Integer i : ar1){
        //      System.out.println(ar1);
        // }

        //  Consumer<Integer> cons = i-> System.out.println(i);

        ar1.forEach(i->System.out.println(i));

    }
    
}
