package api;


import java.util.*;
import java.util.stream.Stream;

public class api4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,40,50,60,80);

        Stream<Integer> steam = list.stream();

        steam.forEach(i->System.out.println(i));


    }


    
}
