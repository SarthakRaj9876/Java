package MapandGeneric;



import java.util.ArrayList;

public class map6 {
    public static void main(String[] args) {

        // typeseaftey
        String ar[] = new String[10];
        ar[0]="virat";
        ar[1]= "rahul";
       // ar[3]= 10;       //CE

       String name1 = ar[0];
       String name2 = ar[1];


        // no typeseafty

        ArrayList ar1 = new ArrayList();
        ar1.add("rohit");
        ar1.add("ankit");

        /*ar1.add(10);

        String name3 = (String)ar1.get(0);
        String name4 = (String)ar1.get(1);
        String name5 = (String)ar1.get(2);

        */
//typeseafty achieve using Generic

        ArrayList<String> ar2 = new ArrayList<String>();

        ar2.add("rohit");
        ar2.add("ankit");

       // ar2.add(10);             //error

        String name6 = ar2.get(0);
        String name7 = ar2.get(2);








    }
    
}
