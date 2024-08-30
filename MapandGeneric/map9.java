package MapandGeneric;


import java.util.*;

public class map9 {
    public static void main(String[] args) {
        ArrayList ar= new ArrayList();
        ar.add(50);
        ar.add(20);
        ar.add(60);
        ar.add(40);
        ar.add(10);

        System.out.println(ar);

        Collections.sort(ar);

        System.out.println(ar);

        ArrayList<String> ar1= new ArrayList<String>();
        ar1.add("virat");
        ar1.add("rahul");
        ar1.add("sid");
        ar1.add("ms");
        ar1.add("rohit");

        System.out.println(ar1);

        Collections.sort(ar1);

        System.out.println(ar1);


        ArrayList ar2= new ArrayList();
        ar2.add(50);
        ar2.add(60);
        ar2.add(70);
        ar2.add(80);
        ar2.add(90);

        System.out.println(ar2);

        int index = Collections.binarySearch(ar2 ,90);

        System.out.println("index is :" + index);

        //Collections.rotate(ar2, 3);

        //System.out.println(ar2);

        Collections.shuffle(ar2);

        System.out.println(ar2);

        System.out.println(Collections.frequency(ar2,70));
    }
}