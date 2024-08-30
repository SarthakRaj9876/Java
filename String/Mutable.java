package String;

public class Mutable {
    public static void main(String[] args) {
       final StringBuilder sb = new StringBuilder("Virat");
        System.out.println(sb);
        sb.append(" Kohli" );
        System.out.println(sb);
       //sb= new StringBuilder("Sachin");
        System.out.println(sb);
        /*String s1 = new String("Sarthak");
        System.out.println(s1);
        s1=new String("Rahul");
        System.out.println(s1);*/
        String s1 ="Sarthak";
        System.out.println(s1);
        s1 = "Rahul";
        System.out.println(s1);



StringBuffer sBuffer1=new StringBuffer("Welcome");
System.out.println("Original String is ::: " + sBuffer1 + ":: having length " + sBuffer1.length());
//using append method
sBuffer1.append(" To Edubca");
System.out.println("Modified String after append is :: " + sBuffer1 + "  :: having length " + sBuffer1.length());
//using reverse method
sBuffer1.reverse();
System.out.println("Modified String after Reverse is :: " + sBuffer1);


    }
    
}
