package String;

public class Immutable {
    public static void main(String[] args) {
        String s1="Sarthak";
        String s2="Sarthak";
        String s3 = new String("Sarthak");
        String s4 = new String("Sarthak");
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s1==s4);
        System.out.println(s1.equals(s4)); //value
        System.out.println("******************************************************************************");    

        // String concating

        String brand2 = "Sarthak";
        System.out.println(brand2);
        String brand6=brand2.concat(" Raj");   //brand2=brand2.concat("Raj");
        System.out.println(brand6);                //system.out.println(brand2);

        System.out.println("*****************************************************************************");
        StringBuilder brand1 = new StringBuilder("Sarthak");
        System.out.println(brand1);
        brand1.append(" Raj");
        System.out.println(brand1);

        System.out.println("********************************************************************************");

        String s6=new String("Ghost");
               s6=s6.concat(" Ridder");
        System.out.println(s6);       

        System.out.println("**********************************************************************************");

        String s0="I";
        String s9=" I"+" am";
        String s8="I"+" am"+" the";
        String s7="I"+" am"+" the"+" Gthost";
        String s5="I"+" am"+" the"+" Gthost"+" of"+" Uchia";
        System.out.println(s7);
        String s10= s0+ s9;
        System.out.println(s10);
        System.out.println(s8);
        System.out.println(s5);

        System.out.println("************************************************************************************");

        
        String str= "My"+ 9999 + 8888 + 5555  ;    
        String str1 ="My"+ " name"+ " is" + " Sarthak" + " Raj" ;      
        System.out.println(str);
        System.out.println(str1);
        System.out.println("***************************************************************************************");

        // Inbuilt method in string

        String s= "Sarthak Raj";
             System.out.println(s.charAt(5));                          //a
        String s15 = new String("Apple");
             System.out.println(s15.charAt(2));                        //p
        StringBuilder sc = new StringBuilder("defender");
             System.out.println(sc.charAt(6));                         //e
             System.out.println(s.concat(" is a KING")); 
             s15+=" Daredevil";
             System.out.println(s15);
             System.out.println(s.substring(8 ));
             System.out.println(s.length());
             System.out.println(s.replace('a','b'));         //not work in sc
             System.out.println(s.toUpperCase());
             System.out.println(s.toLowerCase());                             //not work in sc
             System.out.println(s.trim());


    }
    
}
